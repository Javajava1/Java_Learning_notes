package edu.nwpu.zhao.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author:weilongzhao
 * @time:2021/10/16 10:04
 */
public class NiuKe {
    static List<int[]> freq = new ArrayList<int[]>();
    static List<List<Integer>> ans = new ArrayList<List<Integer>>();
    static List<Integer> sequence = new ArrayList<Integer>();
    public static void tamplate() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pos = new int[n];
        for(int i = 0; i < n; i++){
            pos[i] = sc.nextInt();
        }
        int[] circle = new int[n];
        for(int i = 0; i < n; i++){
            circle[i] = sc.nextInt();
        }
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }
        int[][] array = new int[n][2];
        for(int i = 0; i < n; i++){
            array[i][0] = pos[i] - circle[i];
            array[i][1] = pos[i] + circle[i];
        }
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(array[i][0] + "_" + array[i][1], value[i]);
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int[] dp = new int[10001];
        dp[array[0][1]] = map.get(array[0][0] + "_" + array[0][1]);
        int res = 0;
        for(int i = 1; i < n; i++){
            for(int j = array[i - 1][1] + 1; j < 10001; j++) {
                if (j < array[i][1]) {
                    dp[j] = dp[j - 1];
                } else {
                    if (array[i][0] < array[i - 1][1]) {
                        dp[j] = dp[array[i][0]] + map.get(array[i][0] + "_" + array[i][1]);
                        dp[j] = Math.max(dp[j], dp[j - 1]);
                    } else {
                        dp[j] = dp[array[i - 1][1]] + map.get(array[i][0] + "_" + array[i][1]);
                    }
                    res = Math.max(res, dp[j]);
                    break;
                }
            }
        }
        System.out.println(res);
    }
    static public int dfs2(int[] candidates, int target) {
        int res = 0;
        Arrays.sort(candidates);
        for (int num : candidates) {
            int size = freq.size();
            if (freq.isEmpty() || num != freq.get(size - 1)[0]) {
                freq.add(new int[]{num, 1});
            } else {
                ++freq.get(size - 1)[1];
            }
        }
        dfs(0, target);
        for(List<Integer> list : ans){
            int flag = 0;
            for(int i : list){
                if(i % 2 == 0){
                    flag ++;
                }
            }
            if(flag <= 2){
                res++;
            }
        }
        return res;
    }

    public static void dfs(int pos, int rest) {
        if (rest == 0) {
            ans.add(new ArrayList<Integer>(sequence));
            return;
        }
        if (pos == freq.size() || rest < freq.get(pos)[0]) {
            return;
        }

        dfs(pos + 1, rest);

        int most = Math.min(rest / freq.get(pos)[0], freq.get(pos)[1]);
        for (int i = 1; i <= most; ++i) {
            sequence.add(freq.get(pos)[0]);
            dfs(pos + 1, rest - i * freq.get(pos)[0]);
        }
        for (int i = 1; i <= most; ++i) {
            sequence.remove(sequence.size() - 1);
        }
    }

    static int dfs_res = 0;
    public static void dfs(int[] arr, int target, int s){
        if(target == 0){
            dfs_res++;
        }
        if(target < arr[s] || s >= arr.length){
            return;
        }
        dfs(arr, target, s + 1);
        dfs(arr, target - arr[s], s + 1);
    }
    static int[] arr = null;
    static int res = 0;
    public static int InversePairs(int [] array) {
//         int res = 0;
        arr = new int[array.length];
        merge(array, 0, array.length - 1);
        return res;
    }
    public static void merge(int[] array, int s, int e){
        if(e <= s){
            return;
        }else{
            int mid = (e - s) / 2 + s;
            merge(array, s, mid);
            merge(array, mid + 1, e);
            int i = s, j = mid + 1, k = s;
            for(; i <= mid && j <= e;){
                if(array[i] > array[j]){
                    res += mid - i + 1;
                    arr[k++] = array[j];
                    j++;
                }else{
                    arr[k++] = array[i];
                    i++;
                }
            }
            while(i <= mid){
                arr[k++] = array[i++];
            }
            while(j <= e){
                arr[k++] = array[j++];
            }
            for(int ii = s; ii <= e;ii++){
                array[ii] = arr[ii];
            }
        }

    }
    public static void main(String[] args) throws IOException {
//        tamplate();
//        System.out.println(System.getProperty("user.dir"));
//        fun2();
//        fun6();
//        System.out.println(InversePairs(new int[]{1,2,3,0}));
        tamplate();
    }
    public static void fun6() throws  IOException{
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Map<String, Set<String>> timeToInfo = new HashMap();
        Map<String, List<String>> infoToTime = new HashMap();
        for(int i = 0; i < q; i++){
            int op = sc.nextInt();

            if(op == 1){
                StringBuilder strTime = new StringBuilder();
                int year = sc.nextInt();
                if(year < 2022 || year > 9999){
                    System.out.println("error");
                    break;
                }
                String month = sc.next();
                String day = sc.next();
                strTime.append(year + "/" + month + "/" + day);
                String info = sc.next();
                String time = strTime.toString();
                if(check(time)){
                    //Set<String> set = timeToInfo.getOrDefault(time, new HashSet());
                    if(infoToTime.containsKey(info)){
                        System.out.println("existed");
                    }else{
                        Set<String> set = timeToInfo.getOrDefault(time, new HashSet());
                        set.add(info);
                        timeToInfo.put(time, set);
                        List<String> list = infoToTime.getOrDefault(info, new ArrayList());
                        list.add(time);
                        infoToTime.put(info, list);
                        System.out.println("done");
                    }
                }else{
                    System.out.println("error");
                }
            }else if(op == 2){
                int year = sc.nextInt();
                if(year < 2022 || year > 9999){
                    System.out.println("error");
                    break;
                }
                String month = sc.next();
                String day = sc.next();
                StringBuilder strTime = new StringBuilder();
                strTime.append(year + "/" + month + "/" + day);
                String time = strTime.toString();
                if(!check(time)){
                    System.out.println("error");
                }else{
                    if(timeToInfo.containsKey(time)){
                        System.out.println(timeToInfo.get(time).size());
                    }else{
                        System.out.println(0);
                    }
                }

            }else{
                String info = sc.next();
                if(!infoToTime.containsKey(info)){
                    System.out.println("not existed");
                }else{
                    List<String > timeList = infoToTime.getOrDefault(info, new ArrayList());
                    for(String time : timeList){
                        System.out.print(time + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static boolean check (String str) {
        SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM/dd");
        try {
            sd.setLenient(false);
            sd.parse(str);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
    public static void fun5() throws IOException{
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int res = 0;
        map.put(arr[0], 1);
        list.add(arr[0]);
        boolean flag = false;
        for(int i = 1; i < n; i++){
            flag = false;
            for(int tmp : map.keySet()) {
                if ((tmp + arr[i]) % 7 == 0 && map.get(tmp) > 0) {
                    res += tmp + arr[i];
                    flag = true;
                    map.put(tmp, map.getOrDefault(tmp, 0) - 1);
                }else{
                    map.put(tmp + arr[i], map.getOrDefault(tmp, 0) + 1);
                }
            }
            if(!flag ){
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
        }
        System.out.println(res);
    }
    public static void fun4(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int []set = new int[128];
        for(int i = 0; i < str.length(); i++){
            set[str.charAt(i)]++;
        }
        int cnt_A = 0;
        int cnt_B = 0;
        int cnt_C = 0;
        cnt_A = set['a'];
        cnt_B = set['b'];
        cnt_C = set['c'] / 3;
        int tmp = Math.min(cnt_B, cnt_C);
        int res = Math.min(cnt_A, tmp);
        System.out.println(res);
    }
    public static void fun3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);
        int top = n / 2;
        int res = 0;
        if(n % 2 == 1){
            top ++;
            int j = 0;
            for(int i = 1; i <= top; i++){
                res += i * arr2[j++];
            }
            for(int i = top - 1; i >=1; i--){
                res += i * arr2[j++];
            }
        }else{
            int j = 0;
            for(int i = 1; i <= top; i++){
                res += i * arr2[j++];
            }
            for(int i = top; i >= 1; i--){
                res += i * arr2[j++];
            }
        }
        System.out.println(res);
    }
    public static void fun2() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr2 = new int[n][2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            arr2[i][0] = sc.nextInt();
            arr2[i][1] = sc.nextInt();
            if(map.containsKey(arr2[i][0])){
                int tmp = map.get(arr2[i][0]);
                map.put(arr2[i][0], Math.max(tmp, arr2[i][1]));
            }else {
                map.put(arr2[i][0], arr2[i][1]);
            }
        }
        int len = map.size();
        int[][] arr = new int[map.size()][2];
        int i = 0;
        for(int k : map.keySet()){
            arr[i][0] = k;
            arr[i][1] = map.get(k);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[] dp = new int[len];
        dp[0] = 1;
        for(int j = 1; j < arr.length; j++){
            for(int x = 0; x < j; x++) {
                if (arr[j][1] > arr[x][1]) {
                    dp[j] = Math.max(dp[x] + 1, dp[j]);
                }
            }
        }
        int res = 0;
        for(int j = 0; j < len; j++){
            res = Math.max(dp[j], res);
        }
        System.out.println(res);
    }
    public static long binarySearch(int []arr, int stop, int target){
        int start = 0;
        int end = stop-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return stop-mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return stop-start;
    }
    public static void my_main(String[] args) {
        System.out.println("");
    }
    public static void fun(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = input.nextInt();
        int[] street = new int[n];
        for(int i = 0;i<n;i++){
            street[i] = input.nextInt();
        }
        long res = 0;
        for(int j = 2;j<n;j++){
            long c = binarySearch(street,j,street[j]-d);
            res += c*(c-1)/2;
        }
        System.out.println(res);
    }
    public static void Test(){
        int n = 13;
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0;i<n;i++){
            int digit = input.nextInt();
            arr[digit]++;
        }
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        for(int j = 1;j<arr.length;j++){
            if(arr[j] == 1){
                one++;
            }else if(arr[j] == 2){
                two++;
            }else if(arr[j] == 3){
                three++;
            }else {
                four++;
            }
        }
    }
    public static void my_main1(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int k = sc.nextInt();
            int l = sc.nextInt();
            String str = sc.next();

            if(isFun(str)){
                System.out.println(1);
            }
            String resStr = reverse(str);
            StringBuilder stringB = new StringBuilder();
//             Set<String> set = new HashSet();
            ArrayDeque<String> dq = new ArrayDeque();
//             set.add(str);
            dq.offer(str);
            int res = 0;
            while(!dq.isEmpty() && k > 0){
                String tmp = dq.poll();
                String reverse_tmp = reverse(tmp);
                String str_add1 = tmp + reverse_tmp;
                String str_add2 = reverse_tmp + tmp;
                k--;
                if(isFun(str_add1)){
                    res++;
                }else{
                    dq.offer(str_add1);
                }

                if(isFun(str_add2)){
                    res++;
                }else{
                    dq.offer(str_add2);
                }
            }
            System.out.println(res);
        }
    }
    public static String reverse(String s){
        char[] chs = new char[s.length()];
        for(int i = s.length() - 1, j = 0; i >= 0; i--,j++){
            chs[j] = s.charAt(i);
        }
        return new String(chs);
    }
    public static boolean isFun(String s){
//         char[] chs = new char[s.length()];

        for(int i = s.length() - 1, j = 0; i < j ; i--,j++){

            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void fun1(){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0;i<13;i++){
            int p = input.nextInt();
            arr[p]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int j = 0;j<10;j++){
            if(arr[j]==4){
                continue;
            }
            int[] tmp = Arrays.copyOf(arr,10);
            tmp[j]++;
            if(isHu(tmp)){
                list.add(j);
            }
        }
        if(list.size()==0){
            System.out.println(0);
        }
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static boolean isHu(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        if(sum == 0){
            return true;
        }
        //寻找雀头
        if(sum % 3 != 0){
            for(int i = 0;i<arr.length;i++){
                if(arr[i]>2){
                    arr[i] -= 2;
                    if(isHu(arr)){
                        return true;
                    }
                    arr[i] +=2;
                }
            }
        }
        //顺子
        for(int i = 0;i<arr.length-2;i++){
            if(arr[i]>=1 && arr[i+1]>=1 && arr[i+2]>=1){
                arr[i]--;
                arr[i+1]--;
                arr[i+2]--;
                if(isHu(arr)){
                    return true;
                }
                arr[i]++;
                arr[i+1]++;
                arr[i+2]++;
            }
        }
        //刻子
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=3){
                arr[i] -= 3;
                if(isHu(arr)){
                    return true;
                }
                arr[i] += 3;
            }
        }
        return false;
    }

}
