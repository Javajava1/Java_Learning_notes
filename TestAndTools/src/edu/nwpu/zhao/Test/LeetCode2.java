package edu.nwpu.zhao.Test;

import edu.nwpu.zhao.demo_Genericity.Cat;

import javax.print.attribute.standard.RequestingUserName;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author:weilongzhao
 * @time:2022/7/10 15:23
 */
public class LeetCode2 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
//        threeSum(new int[]{-2,0,1,1,2});
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(2);
//        list2.add(1);
//        HashSet<List<Integer>> set = new HashSet<>();
//        set.add(list);
//        set.add(list2);
//        System.out.println(set.size());
//        permute(new int[]{1, 2, 3});
//        System.out.println(solve(new char[][]{{'1','1','0','0','0'},
//                {'0','1','0','1','1'},
//                {'0','0','0','1','1'},
//                {'0','0','0','0','0'},
//                {'0','0','1','1','1'}}));
//        StringBuilder sb = new StringBuilder();
//        System.out.println(Permutation("abc"));
//        System.out.println(solve(new int[][]{
//                {4,3,3,6,6,3,2,1,0,7},
//                {1,8,2,8,5,9,2,8,3,1},
//                {8,0,9,2,4,3,2,4,3,7},
//                {1,2,2,6,3,0,3,9,7,0},
//                {7,4,3,8,8,3,2,4,6,8},
//                {2,8,9,2,9,3,0,8,7,8},
//                {8,9,9,4,6,3,3,4,9,6},
//                {2,8,3,8,1,3,7,3,0,7},
//                {2,1,1,6,4,1,0,8,1,6},
//                {4,1,3,6,3,4,4,4,0,3}}));
//        System.out.println(solve(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
//        System.out.println(permuteUnique(new int[]{1,1,2}));
//        System.out.println(Permutation("qwertyuio").size());
//        System.out.println(LCS("1A2C3D4B56", "B1D23A456A"));
//        System.out.println(LCS2("1AB2345CD", "12345EF"));
//        System.out.println(minPathSum(new int[][]{
//                {1,3,5,9},
//                {8,1,3,4},
//                {5,0,6,1},
//                {8,8,4,0}
//        }));
//        System.out.println(solve2("101"));
//        System.out.println(minMoney(new int[]{1494,1525,1295,516,3696,1531,4415,3035,4934,1372,3979,2791,2304,2252,4395,3217,3377,4132,2515,333,1587,967,2098,4890,2019,1068,698,4383,782,678,3886,4037,4836,4762,2387,3391,1670,673,764,2335,1579,472,4819}, 4993));
//        System.out.println(minMoney2(new int[]{5, 2, 3}, 20));
//        System.out.println(restoreIpAddresses("000256"));
//        System.out.println(editDistance("nowcoder" , "new"));
//        Map<String, String> map = new HashMap<>();
//        map.put("1", "a");
//        map.put("1", "b");
//        System.out.println(map.get("1"));


//        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
//        System.setIn(fis);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < 5; i++){
//            list.add(sc.nextInt());
//        }
//        fun(n, list);

//        Cat cat = new Cat();
//        System.out.println(longestValidParentheses("()"));
//        System.out.println(maxProfit(new int[]{1,2,4,2,5,7,2,4,9,0}));
//        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
//        System.setIn(fis);
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[9];
//        for(int i = 0; i < 9; i++){
//            arr[i] = sc.nextInt();
//        }
//        List<List<Integer>> res = new ArrayList<>();
//        fun(res, arr, 0);
//        Collections.sort(res, new Comparator<List<Integer>>() {
//            @Override
//            public int compare(List<Integer> o1, List<Integer> o2) {
//                for(int i = 0; i < o1.size(); i++){
//                    if(o1.get(i) != o2.get(i)){
//                        return o1.get(i) - o2.get(i);
//                    }
//                }
//                return -1;
//            }
//        });
//        for(int i = 0; i < res.size(); i++){
//            List<Integer> tmp = res.get(i);
//            for(int j = 0; j < tmp.size(); j++){
//                System.out.print(tmp.get(j));
//                if(j != tmp.size() - 1){
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        String s = "abc";

//        permute(arr);
//        fun3();
//        TreeNode root = new TreeNode(1);
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node3 = new TreeNode(3);
//        root.left = node2;
//        root.right = node3;
//        System.out.println(fun10(root));
//        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
//        System.setIn(fis);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt() ;
//
//        int[] arr = new int[n + 1];
//        for(int i = 1; i < n + 1; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(fun11(arr, 1));
//        System.out.println(lengthOfLongestSubstring("bbabc"));
//        fun14();
//        System.out.println(solution1(new int[]{0, 3, 6, 5}, new int[]{}, 1));
//        System.out.println(solution2("2009"));
//        fun15();
//        char[] chs = new char[3];
//        chs[0] = 'a';
//        chs[1] = 'b';
//        chs[2] = 'c';
//        String s = chs.toString();
//        System.out.println(s);
//        fun21();
//        System.out.println("3");
//        fun22();
//        fun29();
//        fun30();
//        fun42();
//        System.out.println(getBeautiful(654815424));
//        minOperations("abba");
//        ArrayList<Integer> preOrder = new ArrayList<>();
//        ArrayList<Integer> inOrder = new ArrayList<>();
//        preOrder.add(1);
//        preOrder.add(1);
//        preOrder.add(2);
//        inOrder.add(1);
//        inOrder.add(2);
//        inOrder.add(1);
//        getBinaryTrees(preOrder, inOrder);
//        fun45();
//        String s = "abc";
//        s.startsWith("a") ;
//        s.compareTo()
//        fun48(new int[][]{{-1, -1}, {-1, 1}, {1,1}, {1,-1}});
//        fun49();
//        isCover(2, new int[]{1,3}, 1);
//        fun51(95345323l);
//        fun51(9987654311l);
//        fun50(new String[]{"2022-01-01", "2022-01-02"});
        fun53();
    }
    public static void fun54() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        long k = sc.nextLong();
        int ans = 0;
        if(num.length() == 0){
            System.out.println(ans);
            return;
        }
        int left = 0;
        int right = 0;
        while(left <= num.length()){
            if(right == num.length()){
                left++;
                right = left;
                continue;
            }
            String substr = num.substring(left, right + 1);
            long n = Long.parseLong(substr);
            if(n < k){
                ans++;
                right++;
            }else{
                left++;
                right = left;
            }
        }
        System.out.println(ans);
    }
    static int s1, s2;
    public static void fun53() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] res = new int[n][n];
        s1 = 1;
        s2 = 2;
        res[0][0] = s1;
        s1 += 2;
        res[0][1] = s1;
        s1 += 2;
        res[1][0] = s1;
        s1 += 2;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1; j++){
                fun54(i, j, res);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j ++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void fun54(int x, int y, int[][]res){
        int sum = 0;
        for(int i = x; i < x + 2; i++){
            for(int j = y; j < y + 2; j++){
                sum += res[i][j];
            }
        }
        if(sum % 2 == 1){
            if(Math.abs(s1 -s2) <= 2){
                for(int i = x; i < x + 2; i++){
                    for(int j = y; j < y + 2; j++){
                        if(res[i][j] == 0){
                            res[i][j] = s2;
                            s2 += 2;
                        }
                    }
                }
            }else{
                for(int i = x; i < x + 2; i++){
                    for(int j = y; j < y + 2; j++){
                        if(res[i][j] == 0){
                            res[i][j] = s1;
                            s1 += 2;
                        }
                    }
                }
            }

        }else{
            int flag = 1;
            for(int i = x; i < x + 2; i++){
                for(int j = y; j < y + 2; j++){
                    if(res[i][j] == 0 ){
                        if(flag == 1){
                            res[i][j] = s1;
                            s1 += 2;
                            flag = 0;
                        }else{
                            res[i][j] = s2;
                            s2 += 2;
                            flag = 1;
                        }
                    }
                }
            }
        }
    }
    public static void fun52() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < q; i++){
            int type = sc.nextInt();
            int index = sc.nextInt();
            int x = sc.nextInt();
            if(type == 2){
                int tmp = search(x, index, arr);
                res.add(tmp);
            }else{
                arr[index - 1] = x;
            }
        }
        for(int i = 0; i < res.size(); i++){
            System.out.println(res.get(i) + " ");
        }
    }
    public static int search(int x, int end, int[]arr){
        int res = 0;
        for(int i = 0; i < end; i++){
            if(arr[i] == x){
                res++;
            }
        }
        return res;
    }
    public static void fun50(String[] dates) throws ParseException {
        Arrays.sort(dates);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = df.parse("2021-01-01");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        long timestamp = cal.getTimeInMillis();
        System.out.println(timestamp);
        System.out.println(timestamp/1000);

    }
    public static long fun51(long num){
        int[] arr = new int[32];
        for(int i = 31; i >= 0 && num != 0; i--){
            int curBit = (int) (num % 10);
            arr[i] = curBit;
            num = num / 10;
        }
        int[] asc = new int[32];
        Arrays.fill(asc, 1);
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        for(int i = 30; i >= 0; i--){
            if(arr[i] > arr[i + 1]){
                asc[i] = asc[i + 1] + 1;
                pq.offer(new int[]{i, asc[i]});
            }
        }
        long res = 0;
        long max = 0;
        while(!pq.isEmpty()){
            int[] tmp = pq.poll();
            int index = tmp[0];
            res = 0;
            for(int i = index; i < 32; i++){
                res = res * 10 + arr[i];
                if(asc[i] == 1){
                    break;
                }
            }
            max = Math.max(max, res);
            if(arr[index] > arr[pq.peek()[0]]){
                break;
            }
        }
        return max;
    }
//    public void diff(String str1, String str2){
//        String[] str1s = str1.split("-");
//        String[] str2s = str2.split("-");
//        int y1 = Integer.valueOf(str1s[0]);
//        int y2 = Integer.valueOf(str2s)
//
//    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return false;
        }
        int sum = 0, maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        if (maxNum > target) {
            return false;
        }
        boolean[][] dp = new boolean[n][target + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            for (int j = 1; j <= target; j++) {
                if (j >= num) {
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - num];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][target];
    }

    public static void fun50() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[M + 1];
        for(int i = 0; i < M; i++){
            arr[i] = sc.nextInt();
        }
        arr[M] = N + 1;
        int x = sc.nextInt();
        //滑动窗口
        int start = 0;
        int end;
        if(x < M){
            end = arr[x] - 1;
        }else{
            System.out.println(N);
            return;
        }
        int res = end - start;
        for(int i = x; i < M; i++){
            end = arr[i];
            start = arr[i - x];
            res = Math.max(end - start, res);
        }
        System.out.println(res);
    }
    public static void fun49() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        if(arr.length <= 1){
            System.out.println(1);
            return;
        }
        int start = arr[0];
        int end = arr[arr.length - 1];
        int mid = 0;
        while(start <= end){
            mid = (end - start) / 2 + start;
            if(isCover(mid, arr, m)){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        if(isCover(start, arr, m)){
            System.out.println(start);
        }else{
            System.out.println(start + 1);
        }
    }
    public static boolean isCover(int len, int[] arr, int m){
        int end = len + arr[0];
        int i = 0;
        for(; i < arr.length && m > 0;){
            if(end >= arr[i]){
                i++;
                continue;
            }else{
                end = len + arr[i];
                m--;
            }
        }
        if(i == arr.length){
            return true;
        }else{
            return false;
        }
    }
    public static void fun48(int[][] points){
        int[] start = {0, 0};
        boolean[] flag = new boolean[points.length];
        int min = Integer.MAX_VALUE;
        int pos = -1;
        int res = 0;
        for(int j = 0; j < points.length; j++){
            for(int i = 0; i < points.length && !flag[i]; i++){
                int[] point = points[i];
                int dis = Math.abs(point[0] - start[0]) + Math.abs(point[1] - start[1]);
                if(dis < min){
                    pos = i;
                    min = dis;
                    flag[i] = true;
                }
                res += min;
            }
            start = points[pos];
        }
        System.out.println(res);
    }
    public static void fun47() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        String strA = sc.nextLine();
        String strB = sc.nextLine();
        String[] strAs = strA.split(",");
        String[] strBs = strB.split(",");
        int n = strAs.length;
        int[] A = new int[n];
        int[] B = new int[n];
//        int[][] diff = new int[n][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for(int i = 0; i < n; i++){
            A[i] = Integer.valueOf(strAs[i]);
            B[i] = Integer.valueOf(strBs[i]);
            pq.offer(new int[]{A[i] - B[i], i});
        }

        int res = 0;
        while(pq.size() >= 3){
            int tmp = Integer.MAX_VALUE;
            int[] arr1 = pq.poll();
            int[] arr2 = pq.poll();
            int[] arr3 = pq.poll();
            int t1 = arr1[1];
            int t2 = arr2[1];
            int t3 = arr3[1];
            int min = Integer.MAX_VALUE;
            min = Math.min(B[t1], min);
            min = Math.min(B[t2], min);
            min = Math.min(B[t3], min);
            int a = (int) ((A[t1] + A[t2] + A[t3]) * 0.6);
            int b = B[t1] + B[t2] + B[t3] - min;
            int c = 0;
            c += Math.min(A[arr1[1]], B[arr1[1]]);
            c += Math.min(A[arr2[1]], B[arr2[1]]);
            c += Math.min(A[arr3[1]], B[arr3[1]]);
            if(a < b){
                res += Math.min(a, c);
            }else{
                res += Math.min(b, c);
            }
        }
        while(!pq.isEmpty()){
            int[] arr1 = pq.poll();
            if(arr1[0] > 0){
                res += B[arr1[1]];
            }else{
                res += A[arr1[1]];
            }
        }
        System.out.println(res);
    }
    public static void fun46(int[] siginal){
        Map<String, Integer> map = new HashMap<>();
        StringBuilder strb1 = new StringBuilder();
        for(int i = 6; i >= 0; i--){
            if(((1 << i) & siginal[0]) != 0){
                strb1.append("1");
            }else{
                strb1.append("0");
            }
        }
        System.out.println(strb1.toString());
    }
    static int[][] fx = new int[][]{{0, -1}, {0, 1},{-1, 0}, {1, 0}};
    public static void fun45() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] strs = new String[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            strs[i] = sc.nextLine();
        }
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("0,0,0");
        Set<String> set = new HashSet<>();
        boolean flag = false;
        while(!queue.isEmpty()){
            String[] coord = queue.poll().split(",");
            int x = Integer.valueOf(coord[0]);
            int y = Integer.valueOf(coord[1]);
            int step = Integer.valueOf(coord[2]);
            for(int[] co : fx){
//                x += co[0];
//                y += co[1];
                int s = step + 1;
                String tmp = x + "," + y + "," + s;
                if(x < 0 || y < 0 || x >= n || y >= m){
                    break;
                }
//                if(isRight(strs[x].charAt())){
//
//                }
                if(!set.contains(tmp)){
                    queue.offer(tmp);
                    set.add(tmp);
                }
                if(x == n - 1 && y == m - 1){
                    System.out.println(step);
                    flag = true;
                }
            }
            if(flag){
                break;
            }
        }
    }
    public static void fun44() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] strs = new String[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            strs[i] = sc.nextLine();
        }
        int[][] dp = new int[n][m];
        for(int j = 1; j < m; j++){
            if(isRight(strs[0].charAt(j - 1), strs[0].charAt(j))){
                dp[0][j] = dp[0][j - 1] + 1;
            }else{
                dp[0][j] = 250000;
            }
        }
        for(int i = 1; i < n; i++){
            if(isRight(strs[i - 1].charAt(0), strs[i].charAt(0))){
                dp[i][0] = dp[i - 1][0] + 1;
            }else{
                dp[i][0] = 250000;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i > 0 && j > 0){
                    int up = 250000;
                    int left = 250000;
                    if(isRight(strs[i - 1].charAt(j), strs[i].charAt(j))){
                        up = dp[i - 1][j] + 1;
                    }
                    if(isRight(strs[i].charAt(j - 1), strs[i].charAt(j))){
                        left = dp[i][j - 1] + 1;
                    }
                    dp[i][j] = Math.min(left, up);
                }
            }
        }
        System.out.println(dp[n - 1][m - 1]);
    }
    public static boolean isRight(char c1, char c2){
        if(c1 == c2 || (c1 == 'r' && c2 == 'e') || (c1 == 'e' && c2 == 'd') || (c1 == 'd' && c2 == 'r')){
            return true;
        }
        return false;
    }

    static Map<Integer, List<Integer>> mapPre = new HashMap();
    static Map<Integer, List<Integer>> mapIno = new HashMap();
    public static ArrayList<TreeNode> getBinaryTrees (ArrayList<Integer> preOrder, ArrayList<Integer> inOrder) {
        // write code here
//        for(int i = 0; i < preOrder.size(); i++){
//            int key = preOrder.get(i);
//            if(mapPre.containsKey(key)){
//                mapPre.get(key).add(i);
//            }else{
//                List<Integer> tmp = new ArrayList();
//                tmp.add(i);
//                mapPre.put(key, tmp);
//            }
//        }
        for(int i = 0; i < mapIno.size(); i++){
            int key = inOrder.get(i);
            if(mapIno.containsKey(key)){
                mapIno.get(key).add(i);
            }else{
                List<Integer> tmp = new ArrayList();
                tmp.add(i);
                mapIno.put(key, tmp);
            }
        }
        ArrayList<TreeNode> res = new ArrayList<>();
        createTree(preOrder, 0, preOrder.size(), inOrder, 0, inOrder.size());
        return res;
    }
    static StringBuilder sb = new StringBuilder();
    static Map<String, List<Integer>> map = new HashMap();
    public static TreeNode createTree(List<Integer> preArray, int s1, int e1, List<Integer> inArray, int s2, int e2){
        if(s1 > e1){
            return null;
        }
        // int n = preArray.length;
        int val = Integer.valueOf(preArray.get(s1));
        TreeNode root = new TreeNode(val, null, null);
        List<Integer> pos = map.get(preArray.get(s1));
//        for(int i : pos){
        int i = pos.get(0);
            int len = i - s2;
            TreeNode left = createTree(preArray, s1 + 1, s1 + len, inArray, s2, i - 1);
            TreeNode right = createTree(preArray, s1 + len + 1, e1, inArray, i + 1, e2);
            root.left = left;
            root.right = right;
            return root;
//        }
//        return null;
    }
    public static int minOperations (String str) {
        // write code here
        int[] arr = new int[128];
        Set<Character> set = new HashSet();
        Queue<Character> queue = new ArrayDeque();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            arr[c]++;
            if(arr[c] >= 2 && !set.contains(c)){
                set.add(c);
                queue.offer(c);
            }
        }
        int res = 0;
        while(!queue.isEmpty()){
            char tmp_c = queue.poll();
            arr[tmp_c] -= 2;
            int index = findLeast(arr);
            arr[index]++;
            if(arr[index] >= 2){
                queue.offer((char)index);
            }
            res++;
            if(arr[tmp_c] >= 2){
                queue.offer(tmp_c);
            }
        }
        return res;
    }
    public static int findLeast(int[] arr){
        int min = Integer.MAX_VALUE;
        int pos = -1;
        for(int i = 'a'; i <= 'z'; i++){
            if(arr[i] < min){
                min = arr[i];
                pos = i;
            }
        }
        return pos;
    }
    public static void fun43() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        PriorityQueue<Integer> pq_first = new PriorityQueue<>();
        PriorityQueue<Integer> pq_sec = new PriorityQueue<>();
        int i = 0;
        for(; i < l - 1; i++){
            pq_first.offer(arr[i]);
        }
        List<Double>res = new ArrayList<>();
        for(; i < n; i++){
            int flag = 0;
            pq_first.offer(arr[i]);
            if(l % 2 == 0){
                double first = 0;
                double mid = 0;
                double last = 0;
                double left = l / 2;
                for(int j = 1; !pq_first.isEmpty(); j++){
                    int tmp = pq_first.poll();
                    if(j == left){
                        mid += tmp / 2;
                    }
                    if(j == left + 1){
                        mid += tmp / 2;
                    }
                    if(j == 1){
                        first = tmp;
                    }
                    if(pq_first.size() == 0){
                        last = tmp;
                    }
                    if(tmp != arr[i - l + 1]){
                        pq_sec.offer(tmp);
                    }else{
                        if(flag == 1){
                            pq_sec.offer(tmp);
                        }else{
                            flag = 1;
                        }
                    }
                }
                if(Math.abs(mid - first) < Math.abs(mid - last)){
                    res.add(last);
                }else{
                    res.add(first);
                }
            }else{
                double first = 0;
                double mid = 0;
                double last = 0;
                int left = l / 2 + 1;
                for(int j = 1; !pq_first.isEmpty(); j++){
                    int tmp = pq_first.poll();
                    if(j == left){
                        mid = (double)tmp;
                    }
                    if(j == 1){
                        first = tmp;
                    }
                    if(pq_first.size() == 0){
                        last = tmp;
                    }
                    if(tmp != arr[i - l + 1]){
                        pq_sec.offer(tmp);
                    }else{
                        if(flag == 1){
                            pq_sec.offer(tmp);
                        }else{
                            flag = 1;
                        }
                    }
                }
                if(Math.abs(mid - first) < Math.abs(mid - last)){
                    res.add(last);
                }else{
                    res.add(first);
                }
            }
            PriorityQueue<Integer> t = null;
            t = pq_first;
            pq_first = pq_sec;
            pq_sec = t;
        }
        for(double ans : res){
            System.out.print((int)ans + " ");
        }
    }
    public static void fun42() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        int[] target = new int[n];
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            start[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            end[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            target[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            int s = start[i];
            int e = end[i];
            for(int j = s; j <= e; j++){
                int t = getBeautiful(j);
                if(t == target[i]){
                    ans[i]++;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static int getBeautiful(int i){
        int t = 0;
        while(i != 0){
            t = t ^ (i % 10);
            i = i / 10;
        }
        return t;
    }
    public static void fun41() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value = new int[n + 1];
        for(int i = 1; i < n + 1; i++){
            value[i] = sc.nextInt();
        }
        int[]parent = new int[n + 1];
        int[] degree = new int[n + 1];
        for(int i = 2; i < n + 1; i++){
            int par = sc.nextInt();
            int child = sc.nextInt();
            parent[child] = par;
            degree[par]++;
        }
        ArrayDeque<Integer> q = new ArrayDeque();
        for(int i = 1; i < n + 1; i++){
            if(degree[i] == 0){
                q.offer(i);
            }
        }

        int constant = 1000000007;
        int[] mutilple = new int[n + 1];
        Arrays.fill(mutilple, 1);
        while(!q.isEmpty()){
            int node = q.poll();
            int par = parent[node];
            mutilple[par] = value[par] * value[node];
            degree[par]--;
            if(degree[par] == 0){
                q.offer(par);
            }
        }
        int res = 0;
        for(int i = 1; i < n + 1; i++){
            res += getFactors1(mutilple[i]);
        }
        System.out.println(res);
    }
    public static int getFactors1(int n){
        int res = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                res += 2;
            }
        }
        return res;
    }
    public static void fun40() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue(new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                return o2 - o1;
            }
        });
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            pq.offer(arr[i]);
        }
        while(k > 0){
            int tmp = pq.poll();
            int diff = tmp - pq.peek();

            int m = Math.max(diff / x, 1);
            m = Math.min(m , k);

            k -= m;
            tmp -= m * x;
            pq.offer(tmp);
        }
        System.out.println(pq.peek());
    }
    public static void fun39() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

    }
    public static void fun38() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        int[] dp = new int[max + 1];

        dp[1] = 0;
        if(max + 1 > 2){
            dp[2] = 1;
        }
        for(int i = 3; i < max + 1; i++){
            int[] factors = getFactors(i);
            dp[i] = dp[1] + dp[i - 1] + 1;
            if(factors[1] != i && factors[0] != i){
                dp[i] = Math.min(dp[i], dp[factors[0]] + dp[factors[1]] + 1);
            }
        }
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            res += dp[arr[i]];
        }
        System.out.println(res);
    }
    public static int[] getFactors(int n){
        int start = (int)Math.sqrt(n);
        for(int i = start; i <= n; i++){
            if(n % i == 0){
                return new int[]{i, n / i};
            }
        }
        return null;

    }
    public static void fun37() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        int[] chs_S = new int[128];
        int[] chs_T = new int[128];
        for(int i = 0; i < S.length(); i++){
            chs_S[S.charAt(i)]++;
        }
        for(int i = 0; i < T.length(); i++){
            chs_T[T.charAt(i)]++;
        }
        if(chs_S['#'] == 0){
            System.out.println(S);
            return;
        }
        int max = 0;
        for(int i = 'a'; i <= 'z'; i++){
            max = Math.max(max, chs_S[i]);
        }
        int res = 1;
        for(; res <= max; res++){
            increase(chs_T, res);
            if(cover(chs_S, chs_T)){
                continue;
            }else{
                for(int i = 'z'; i >= 'a'; i--){
                    int diff = chs_T[i] - chs_S[i];
                    if(diff <= 0){
                        continue;
                    }
                    if(chs_S['#'] >= diff){
                        chs_S['#'] -= diff;
                        chs_S[i] += diff;
                    }else{
                        chs_T[i] += chs_S['#'];
                        break;
                    }
                }
            }
            if(chs_S['#'] == 0){
                break;
            }
        }
        StringBuilder strb = new StringBuilder(S);
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < S.length(); i++){
            if(strb.charAt(i) != '#'){
                chs_S[strb.charAt(i)]--;
            }else{
                q.offer(i);
            }
        }
        for(int i = 'z'; i >= 'a'; i--){
            while(chs_S[i] != 0){
                int index = q.poll();
                strb.setCharAt(index, (char)i);
                chs_S[i]--;
            }
        }
        int i;
        for(i = 'z'; i >= 'a'; i--){
            if(chs_T[i] != 0){
                break;
            }
        }
        while(q.size() != 0){
            int index = q.poll();
            strb.setCharAt(index, (char) i);
        }
        System.out.println(strb.toString());
    }
    public static void increase(int[] chs, int res){
        for(int i = 'a'; i <= 'z'; i++){
            int tmp = chs[i] / res;
            chs[i] += tmp;
        }
    }
    public static boolean cover(int[] chs_S, int[] chs_T){
        for(int i = 'a'; i <= 'z'; i++){
            if(chs_S[i] < chs_T[i]){
                return false;
            }
        }
        return true;
    }
    public static void fun36() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(a[i] < b[j] && 2 * a[i] >= b[j]){
                    for(int k = 0; k < n; k++){
                        if(b[j] < c[k] && 2 * b[j] >= c[k]){
                            res++;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
    public static void fun35() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] parent = new int[n];
        for(int i = 1; i < n; i++){
            parent[i] = sc.nextInt();
        }
        sc.nextLine();
        String str = sc.nextLine();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int flag = 1 << (str.charAt(i) - 'A');
            map.put(i + 1, flag);
        }
        for(int i = n - 1; i > 0; i--){
            int par = parent[i];
            int flag = map.get(par);
            flag = flag | (map.get(i + 1));
            map.put(par, flag);
        }
        for(int i = 0; i < n; i++){
            int res = 0;
            int flag = map.get(i + 1);
            for(int j = 0; j < 26; j++){
                if((flag & (1 << j)) != 0){
                    res++;
                }
            }
            System.out.print(res + " ");
        }
    }
    public static void fun34() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int[] tmp = Arrays.copyOf(nums, n);
        Arrays.sort(nums);
        int a = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == a){
                a++;
            }else{
                break;
            }
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            if(tmp[i] < a) {
                ans[i] = tmp[i];
            }else{
                ans[i] = a;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    public static void fun33() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] city = new int[m];
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            city[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        int[][] dp = new int[m + 1][n + 1];
        Arrays.fill(dp, -1);
        dp[0][k] = 0;
        for(int i = 1; i <= m; i++){
            int c = city[i - 1];
            for(int j = 1; j <= n; j++){
                if(dp[i - 1][j] != -1){
//                    if(j == c){
//                        dp[i][c] =
//                    }
//                    dp[i][c] = Math.max(dp[i - 1][c], );
                }
            }
        }

//        System.out.println(pq.poll());
    }
    public static void fun32(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        ListNode l4 = new ListNode(4);
        combineTwoDisorderNodeToOrder(l1, l4);
    }
    public static ListNode combineTwoDisorderNodeToOrder (ListNode node1, ListNode node2) {
        // write code here
        ListNode head = new ListNode(-1);
        ListNode l1;
        ListNode l2;
        while(node1 != null && node2 != null){
            if(node1.val < node2.val){
                l1 = node1.next;
                node1.next = null;
                insert(head, node1);
                node1 = l1;
            }else{
                l2 = node2.next;
                node2.next = null;
                insert(head, node2);
                node2 = l2;
            }
        }
        while(node1 != null){
            l1 = node1.next;
            node1.next = null;
            insert(head, node1);
            node1 = l1;
        }
        while(node2 != null){
            l2 = node2.next;
            node2.next = null;
            insert(head, node2);
            node2 = l2;
        }
        return head.next;
    }
    public static void insert(ListNode head, ListNode node){
        ListNode pre = head;
        head = head.next;
        while(head != null){
            if(node.val < head.val){
                break;
            }
            pre = head;
            head = head.next;
        }
        pre.next = node;
        node.next = head;
    }
    public static void fun31() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int[] digits = new int[2];
//        Arrays.sort(digits, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
    }
    public static void fun30() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
////        String str = sc.nextLine();
////        BigDecimal bd = new BigDecimal(str);
//        long res = Long.MAX_VALUE;
//        for(int i = 2; i <= N / 2; i++){
//            if(N % i == 0){
//                if(i != N){
//                    res = Math.min(res, (N / i) + i);
//                }else{
//                    res = Math.min(res, N);
//                }
//
//            }
//        }
        int sum = 0;
        int div_idx = 2;
        int sqrt_n = (int) Math.sqrt(N);
        while(true){
            if(div_idx > sqrt_n){
                break;
            }
            if(N % div_idx == 0){
                sum += div_idx;
                N /= div_idx;
                sqrt_n = (int) Math.sqrt(N);
            }else{
                div_idx++;
            }
        }
        System.out.println(sum + N);
    }
    public static int fun31(int N){
        if(N == 1){
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for(int i = 2; i <= N / 2; i++){
            if(N % i == 0){
                if(i != N){
                    res = Math.min(res, i + fun31(N / i));
                }else{
                    res = Math.min(res, N);
                }
            }
        }
        return res;
    }
    public static void fun29() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[m][3];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < 3; j++){
                array[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[] res = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            res[i] = 1;
            if(isOK(res, m, array)){
                count++;
            }else{
                res[i] = 0;
            }
        }
        System.out.println(count);
    }

    public  static boolean isOK(int[] res, int m, int[][]arr){
        for(int j = 0; j < m; j++){
            int s = 0;
            for(int k = arr[j][0] - 1; k<= arr[j][1] - 1; k++){
                s += res[k];
                if(s > arr[j][2]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void fun28() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] start = new int[N];
        int[] end = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            start[i] = sc.nextInt();
            map.put(start[i], i);
        }
        for(int i = 0; i < N; i++){
            end[i] = sc.nextInt();
        }
        int res = 0;
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                if(map.get(end[i]) > map.get(end[j])){
                    res++;
                    break;
                }
            }
        }
        System.out.println(res);
    }
    public static void fun27() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = sc.nextInt();
        n = (n - 1) * 2 + 1;
        int startP = n;
        int m = sc.nextInt();
        m = (m - 1) * 2  + 1;
        int startT = m;
        int res = fun28(n, m, N);
        System.out.println(res);
    }
    public static int fun28(int startP, int startT, int N){
        int diff;
        if(startT > startP){
            diff = startT - startP;
        }else{
            diff = startT - startP + 2 * N;
        }
        int oneCircle = (int) Math.ceil(2 * N / 1.5);
        if(diff / 0.5 < oneCircle) {
            return (int)(diff / 0.5);
        }else{
            int s = startP + oneCircle * 2;
            int num = s / (2 * N);
            if(s - num * (2 * N) == startT){
                return oneCircle;
            }
            return oneCircle + fun28(s + 2 - 2 * N, startT, N);
        }
    }
    public static void fun26() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] queries = new int[X];
        for(int i = 0; i < X; i++){
            queries[i] = sc.nextInt();
        }
        int Y = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < Y; i++){
            int url = sc.nextInt();
            int ttl = sc.nextInt();
            map.put(url, ttl);
        }
        int[] ans = new int[X];
        Map<Integer, Integer> cache = new HashMap<>();
        for(int i = 0; i < X; i++){
            int url = queries[i];
            if(cache.containsKey(url)){
                ans[i] = 0;
            }else{
                ans[i] = 1;
                if(cache.size() >= N){

                }else{
                    if(map.containsKey(url)){
                        cache.put(url, map.get(url));
                    }else{
                        cache.put(url, 5);
                    }
                }
            }
            for(int key : map.keySet()){
                if(map.get(key) == 1){
                    map.remove(key);
                }else{
                    map.put(key, map.get(key) - 1);
                }
            }
        }
    }
    public static void fun25() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        if(n == 2){
            System.out.println("0");
            return;
        }
        int res = Integer.MAX_VALUE;
        int[] dis = new int[n];
        for(int i = 1; i < n; i++){
            dis[i] = arr[i] - arr[i - 1];
        }
        for(int i = 1; i < n - 1; i++){
            int tmp = 0;
            if(Math.abs(arr[i + 1] - arr[i - 1]) % 2 == 1){
                tmp = Math.abs(arr[i + 1] - arr[i - 1]) / 2 + 1;
            }else{
                tmp = Math.abs(arr[i + 1] - arr[i - 1]) / 2;
            }
            dis[i] = tmp;
            dis[i + 1] = tmp;
            res = Math.min(res, getArrayMax(dis));
            dis[i] = arr[i] - arr[i - 1];
            dis[i + 1] = arr[i + 1] - arr[i];
        }
        dis[1] = 0;
        res = Math.min(res, getArrayMax(dis));
        dis[1] = arr[1] - arr[0];
        dis[n - 1] = 0;
        res = Math.min(res, getArrayMax(dis));
        System.out.println(res);
    }
    public static int getArrayMax(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(arr[i], max);
        }
        return max;
    }
    public static void fun24() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]parent = new int[n + 1];
        int[]value = new int[n + 1];
        for(int i = 2; i < n + 1; i++){
            parent[i] = sc.nextInt();
        }
        for(int i = 1; i < n + 1; i++){
            value[i] = sc.nextInt();
        }
        int[] degree = new int[n + 1];
        for(int i = 2; i < n + 1; i++){
            degree[parent[i]]++;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 1; i < n + 1; i++){
            if(degree[i] == 0){
                queue.offer(i);
            }
        }
        int res = 0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            int par;
            res += Math.abs(value[node]);
            par = parent[node];
            degree[par]--;
            if(degree[par] == 0){
                queue.offer(par);
            }
            while(par != 0){
                value[par] -= value[node];
                par = parent[par];
            }
        }
        System.out.println(res);
    }
    public static void fun23() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
    }
    public static void second() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            list.add(new ArrayList<>());
        }
        int max = 0;
        for(int i = 0; i < n - 1; i++){
            String str_tmp = sc.nextLine();
            String[] strs_tmp = str_tmp.split(" ");
            int cur = Integer.valueOf(strs_tmp[0]);
            for(int j = 1; j < strs_tmp.length; j++){
                int tmp = Integer.valueOf(strs_tmp[j]);
                list.get(cur).add(tmp);
                max = Math.max(tmp, max);
            }
        }
        int []ans = new int[strs.length];
        for(int i = 0; i < strs.length; i++){
            int start = Integer.valueOf(strs[i]);
            Set<Integer> set = new HashSet<>();

            boolean f = dfs(list, start, set);
            ans[i] = f ? 1 : 0;
        }
        for(int i = 0; i < strs.length; i++){
            System.out.println(ans[i]);
        }
    }
    public static boolean dfs(List<List<Integer>> adjLists, int start, Set<Integer> set){
        if(set.contains(start)){
            return false;
        }
        set.add(start);
        List<Integer> nexts = adjLists.get(start);
        for(int i = 0; i < nexts.size(); i++){
            int next = nexts.get(i);
            if(adjLists.get(next).size() == 0){
                return true;
            }
            if(!dfs(adjLists, next, set)){
                break;
            }
            set.add(next);
        }
        return false;
    }
    public static List<Integer> isCircularDep(int n, List<List<Integer>> adjLists) {
        int[] inDegrees = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < inDegrees.length; i++) {
            if (inDegrees[i] == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                ans.add(cur);
                List<Integer> adjList = adjLists.get(cur);
                for (int adj : adjList) {
                    inDegrees[adj]--;
                    if (inDegrees[adj] == 0) {
                        queue.offer(adj);
                    }
                }
            }
        }
        if (ans.size() == n) {
            return ans;
        } else {
            return null;
        }
    }
    public static int minimumOperations2(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        Map<Integer,Integer> mapA=new HashMap<>();
        Map<Integer,Integer> mapB=new HashMap<>();
        for(int i=0;i<nums.length;i+=2){
            if(i+1<nums.length){
                mapB.put(nums[i+1],mapB.getOrDefault(nums[i+1],0)+1);
            }
            mapA.put(nums[i],mapA.getOrDefault(nums[i],0)+1);
        }


        int aa=0,a1=0,a2=0;
        int bb=0,b1=0,b2=0;
        for(Map.Entry<Integer,Integer> entry:mapA.entrySet()){
            if(entry.getValue()>a1){
                a2=a1;
                a1=entry.getValue();
                aa=entry.getKey();
            }else if(entry.getValue()>a2){
                a2=entry.getValue();
            }
        }

        for(Map.Entry<Integer,Integer> entry:mapB.entrySet()){
            if(entry.getValue()>b1){
                b2=b1;
                b1=entry.getValue();
                bb=entry.getKey();
            }else if(entry.getValue()>b2){
                b2=entry.getValue();
            }
        }

        if(aa!=bb){
            return nums.length-a1-b1;
        }else{
            return nums.length-Math.max(a1+b2,b1+a2);
        }
    }

    public static int minimumOperations(int[] nums) {
        int maxNum = 100010;
        int length = nums.length;
        int[] jiArr = new int[maxNum];
        int[] ouArr = new int[maxNum];
        int jiMax = 0;
        int jiMaxNext = 0;
        int ouMax = 0;
        int ouMaxNext = 0;
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            if (i % 2 == 0) {
                ouArr[num]++;
                if (ouMax == 0 || ouArr[num] > ouArr[ouMax]) {
                    ouMaxNext = ouMax;
                    ouMax = num;
                } else if (num != ouMax && (ouMaxNext == 0 || ouArr[num] > ouArr[ouMaxNext])) {
                    ouMaxNext = num;
                }
            } else {
                jiArr[num]++;
                if (jiMax == 0 || jiArr[num] > jiArr[jiMax]) {
                    jiMaxNext = jiMax;
                    jiMax = num;
                    // 跟第二大比较，不能等于第一大
                } else if (jiMax != num && (jiMaxNext == 0 || jiArr[num] > jiArr[jiMaxNext])) {
                    jiMaxNext = num;
                }
            }
        }
        if (ouMax != jiMax) {
            return length - ouArr[ouMax] - jiArr[jiMax];
        } else {
            int max = Math.max(ouArr[ouMax] + jiArr[jiMaxNext], jiArr[jiMax] + ouArr[ouMaxNext]);
            return length - max;
        }
    }

    public static void  fun21() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arr = new int[number];
        for(int i = 0; i < number; i++){
            arr[i] = scanner.nextInt();
        }
        int ret = minimumOperations2(arr);
        System.out.println(ret);
    }
    public static void fun20() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n / 3;
        int constInt = 1000000007;
        long res = 0;
        if(n <= 7){
            int i = 1;
            while(i <= n - 1){
                res += i;
                i++;
            }
            System.out.println(res);
        }else{
            int i = 7;
            res = 21;
            res += (n - i) * 6;
            System.out.println(res % constInt);
        }
    }
    public static void fun19() throws  FileNotFoundException{
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        sc.nextLine();
        String[] res = new String[group];
        for(int i = 0; i < group; i++){
            String s = sc.nextLine();
            String t = sc.nextLine();
            res[i] = judge(s, t);
        }
        for(int i = 0; i < group; i++){
            System.out.println(res[i]);
        }
    }
    public static String judge(String s, String t){
        if(s.length() > t.length()) return "NO";
        if(s.charAt(0) != t.charAt(0)){
            return "NO";
        }
        int i = 1, j = 1;
        while(i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
            i++;
        }
        while(j < t.length()){
            if(t.charAt(j) == t.charAt(j - 1)){
                j++;
            }else{
                if(i == s.length()){
                    return "NO";
                }else{
                    if(s.charAt(i) != t.charAt(j)){
                        return "NO";
                    }else{
                        i++;
                        j++;
                        while(i < s.length() && s.charAt(i) == s.charAt(i - 1)){
                            i++;
                        }
                    }
                }
            }
        }
        if(i == s.length() && j == t.length()){
            return "YES";
        }
        return "NO";
    }
    public static void fun18() throws  FileNotFoundException{
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        String[] strs1 = str1.split(" ");
        String[] strs2 = str2.split(" ");
        String[] strs3 = str3.split(" ");
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();
        for(int i = 0; i < strs1.length; i++){
            set1.add(strs1[i]);
        }
        for(int i = 0; i < strs2.length; i++){
            set2.add(strs2[i]);
        }
        for(int i = 0; i < strs3.length; i++){
            set3.add(strs3[i]);
        }
        int m = sc.nextInt();
        sc.nextLine();
        String[] ans = new String[m];
        for(int i = 0; i < m; i++){
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            ans[i] = judge(strs, set1, set2, set3);
        }
        for(int i = 0; i < m; i++){
            System.out.println(ans[i]);
        }
    }
    public static String judge(String[] strs, Set<String> set1, Set<String> set2, Set<String> set3){
        if(strs.length == 0){
            return "NO";
        }
        int flag = 0;
        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            if(flag == 0){
                if(!set1.contains(str)){
                    if(i == 0){
                        return "NO";
                    }else{
                        if(set2.contains(str)){
                            flag = 2;
                        }else{
                            return "NO";
                        }
                    }
                }
            }else{
                if(!set3.contains(str)){
                    return "NO";
                }
            }
        }
        if(flag == 0){
            return "NO";
        }
        return "YES";
    }
    public static void fun17() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] strs = new String[2 * T];
        for(int i = 0; i < 2 * T; i++){
            strs[i] = sc.next();
        }

    }
    public static int solution(int[] A, int[] B) {
        // write your code in Java 8 (Java SE 8)
        int N = A.length + 1;
        Map<Integer, Set<Integer>> map = new HashMap();
        int[] grade = new int[N];
        for(int i = 0; i < A.length; i++){
            if(map.containsKey(A[i])){
                Set<Integer> set = map.get(A[i]);
                set.add(B[i]);
            }else{
                Set<Integer> set = new HashSet<>();
                set.add(B[i]);
                map.put(A[i], set);
            }
            grade[A[i]]++;
            grade[B[i]]++;
        }
        PriorityQueue<int[]> pq = new PriorityQueue(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for(int i = 0; i < grade.length; i++){
            pq.offer(new int[]{i, grade[i]});
        }
        int[] takeNums = new int[N];
        Arrays.fill(takeNums, 4);
        int res = N - 1;
        while(!pq.isEmpty()){
            int[] tmp = pq.poll();
            if(tmp[0] == 0){
                continue;
            }
            int p = tmp[1];
//            while(map.get(p).contains(0)){
//                int next = map.get(p);
//                takeNums[next]--;
//                if(takeNums[next] == 0){
//                    res++;
//                    takeNums[next] = 5;
//                }
//                p = next;
//            }
        }
        return res;
    }
    public static String solution2(String S) {
        // write your code in Java 8 (Java SE 8)
        int[] digits = new int[10];
        for(int i = 0; i < S.length(); i++){
            digits[S.charAt(i) - '0']++;
        }
        StringBuilder strB = new StringBuilder();
        for(int i = 9; i >= 0; i--){
            while(digits[i] >= 2){
                strB.append(i);
                digits[i] -= 2;
            }
        }
        for(int i = 9; i >= 0; i--){
            if(digits[i] > 0){
                strB.append(i);
                break;
            }
        }
        if(strB.charAt(0) == '0' && strB.charAt(strB.length() - 1) == '0'){
            return "0";
        }
        if(strB.charAt(0) == '0'){
            return strB.substring(strB.length() - 1);
        }
        for(int i = strB.length() - 2; i >= 0; i--){
            strB.append(strB.charAt(i));
        }
        return strB.toString();
    }
    public static int fun17(int[] A, int[] B) {
        int n = A.length;
        int[][] map = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            map[A[i]][B[i]] = 1;
            map[B[i]][A[i]] = 1;
        }

        //表示每个节点都在第几层
        int[] level = new int[n + 1];

        Deque<Integer> deque = new ArrayDeque<>();
        //key表示层数，对应每层的子节点队列
        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();


        for (int i = 1; i < n + 1; i++) {
            if(map[0][i] == 1){
                deque.addLast(i);
                //第一层
                level[i] = 1;

                ArrayList<Integer> list = hashMap.getOrDefault(1,new ArrayList<>());
                list.add(i);
                hashMap.put(1,list);

            }
        }

        while(!deque.isEmpty()){
            int num = deque.pollFirst();
            for (int i = 0; i < n + 1; i++) {
                if(map[num][i] == 1){
                    if(level[i] == 0){
                        level[i] = level[num] + 1;
                        //
                        ArrayList<Integer> list = hashMap.getOrDefault(level[num] + 1,new ArrayList<>());
                        list.add(i);
                        hashMap.put(level[num] + 1,list);

                        deque.addLast(i);
                    }
                }
            }
        }

        //每个节点有多少人要在这里过
        //key是节点，value是要过的人数
        HashMap<Integer,Integer> numMap = new HashMap<>();
        numMap.put(0,0);
        for (int i = 1; i < n+1; i++) {
            numMap.put(i,1);
        }

        int ans = 0;
        int maxLevel = n;
        while(maxLevel > 0) {
            if (!hashMap.containsKey(maxLevel)) maxLevel--;
            else {
                ArrayList<Integer> list = hashMap.get(maxLevel);
                for (int i = 0; i < list.size(); i++) {
                    int node = list.get(i);
                    //找到其上层节点并把人都转过去
                    int father = node;
                    for (int j = 0; j < n + 1; j++) {
                        if (map[node][j] == 1 && level[j] < level[node]) {
                            father = j;
                            break;
                        }
                    }
                    if(numMap.get(node) % 5 == 0){
                        ans += numMap.get(node) / 5;
                    }else{
                        ans += numMap.get(node) / 5 + 1;
                    }
                    numMap.put(father, numMap.get(father) + numMap.get(node));
                }
                maxLevel--;

            }
        }
        return ans;

    }
    public static void fun16() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            B[i] = sc.nextInt();
        }
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1; i <= m; i++){
            dp[0][i] = dp[0][i - 1] + Math.abs(B[i - 1]);
        }
        for(int i = 1; i <= n; i++){
            dp[i][0] = dp[i - 1][0] + Math.abs(A[i - 1]);
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i > j){
                    int tmp1 = Math.abs(A[i - 1]) + dp[i - 1][j];
                    int tmp2 = Math.abs(A[i - 1] - B[j - 1]) + dp[i - 1][j - 1];
                    dp[i][j] = Math.min(tmp1, tmp2);
                }else if(i < j){
                    int tmp1 = Math.abs(B[j - 1]) + dp[i][j - 1];
                    int tmp2 = Math.abs(A[i - 1] - B[j - 1]) + dp[i - 1][j - 1];
                    dp[i][j] = Math.min(tmp1, tmp2);
                }else{
                    dp[i][j] = dp[i - 1][j - 1] + Math.abs(A[i - 1] - B[j - 1]);
                }
            }
        }
        System.out.println(dp[n][m]);
    }
    public static void fun15() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];//材料
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int res = 0;
        int i = 0, j = 0;
        for(; i < n && j < m;){
            if(arr2[j] >= arr1[i]){
                res += arr2[j];
                i++;
            }else{
                j++;
            }
        }
        if(j == m){
            System.out.println(-1);
        }else{
            System.out.println(res);
        }
    }
    public static int solution1(int[] X, int[] Y, int W) {
        // write your code in Java 8 (Java SE 8)
        if(X.length == 0){
            return 0;
        }
        Arrays.sort(X);
        int res = 1;
        int start = X[0];
        for(int i = 0; i < X.length; i++){
            if(X[i] <= start + W){
                continue;
            }else{
                start = X[i];
                res++;
            }
        }
        return res;
    }
    public static void fun14() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int target = sc.nextInt();
        String str = sc.next();
        if(str.length() != len * 2){
            System.out.println(-4);
        }
        System.out.println(isValid(str, target));
    }
    public static int isValid(String str, int target){
        if(str.length() % 2 != 0){
            return -4;
        }
        int len = str.length() / 2;
        if(len < 22 || len > 1024){
            return -4;
        }
        String str1 = str.substring(32, 40);
        int messageLen = Integer.parseInt(str1, 16);
        if(messageLen != str.length() / 2 - 20){
            return -4;
        }
        String str2 = str.substring(44);
        int i = 0;

        for(; i + 8 < str2.length();){
            int l = Integer.parseInt(str2.substring(i + 4, i + 8), 16);
            i = i + 8 + 2 * l;
//            str2 = str2.substring(i);
        }
        if(i != str2.length()){
            return -2;
        }
//        String str3 = str.substring(40);
        for (int j = 44; j < str.length();){
            int t = Integer.parseInt(str.substring(j, j + 4), 16);
            int l = Integer.parseInt(str.substring(j + 4, j + 8), 16);
            if(t == target){
                return j / 2;
            }
            j = j + 8 + 2 * l;
        }
        return -1;
    }
    public static  void fun13() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n + 2][n + 2];
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < n + 1; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int[][] dp1 = new int[n + 2][n + 2];
        int res1 = findBestWay(arr, dp1, n);
        findPath(arr, dp1, n);
        int[][] dp2 = new int[n + 2][n + 2];
        int res2 = findBestWay(arr, dp2, n);
        System.out.println(res1 + res2);
    }
    public static int findBestWay(int[][]arr, int[][]dp1, int n){
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < n + 1; j++){
                dp1[i][j] = Math.max(dp1[i - 1][j], dp1[i][j - 1]);
                if(arr[i][j] > 0){
                    dp1[i][j] += 1;
                }
            }
        }
        return dp1[n][n];
    }
    public static void findPath(int [][]arr, int[][] dp, int n){
        for (int i = n, j = n; i > 0 && j > 0;) {
                if(dp[i][j - 1] > dp[i - 1][j]){
                    if(arr[i][j - 1] > 0){
                        arr[i][j - 1]--;
                    }
                    j--;
                }else{
                    if(arr[i - 1][j] > 0){
                        arr[i - 1][j]--;
                    }
                    i--;
                }
        }
    }
    public static void fun12() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner in = new Scanner(System.in);
        int[] res;

        int arr_rows = 0;
        int arr_cols = 0;
        arr_rows = in.nextInt();
        arr_cols = in.nextInt();

        int[][] arr = new int[arr_rows][arr_cols];
        for(int arr_i=0; arr_i<arr_rows; arr_i++) {
            for(int arr_j=0; arr_j<arr_cols; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        schedule(arr);
//        res = new Solution().schedule(arr);
//        for(int res_i=0; res_i < res.length; res_i++) {
//            System.out.println(String.valueOf(res[res_i]));
//        }
        HashMap<String, String> map = new HashMap<>();
        map.put(null, null);
    }

    public boolean fun(int[] arr){
        //第二种情况
        if((arr[0] <= 9 && arr[0] >= 0) && ( arr[arr.length - 1] >= 0 && arr[arr.length - 1] <= 9)){
            for(int i = 1; i < arr.length - 1; i++){
                if(arr[i] >= 10 && arr[i] <= 99){
                    continue;
                }else{
                    return false;
                }
            }
            return true;
        }else if((arr[0] <= 99 && arr[0] >= 10) && ( arr[arr.length - 1] >= 10 && arr[arr.length - 1] <= 99)){
            for(int i = 1; i < arr.length - 1; i++){
                if(arr[i] < 10){
                    continue;
                }else{
                    return false;
                }
            }
            return true;
        }else{//第一种情况
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] >= 10 && arr[i - 1] < 10){
                    continue;
                }else if(arr[i] < 10 && arr[i - 1] >= 10){
                    continue;
                }else{
                    return false;
                }
            }
            return true;
        }
    }

    public static void schedule(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] arr_T = new int[m][n + 1];
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr_T[j][i + 1] = arr[i][j];
            }
        }
        arr_T[2][0] = arr_T[0][1];
        int[] dp = new int[n + 1];
        for(int i = 1; i < n + 1; i++){
            int target = arr_T[1][i];
            int index = b_search(arr_T[2], i - 1, target);
            dp[i] = Math.max(dp[i - 1], arr_T[0][index] + arr_T[0][i]);
        }
        System.out.println(dp[n]);
    }
    public static int b_search(int[] arr, int end, int target){
        int s = 0;
        while(s <= end){
            int mid = (end - s) / 2 + s;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return s;
    }

    public static int lengthOfLongestSubstring (String s) {
        // write code here
        if(s == null && "".equals(s)){
            return 0;
        }
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int res = 0;
        int i = 0;
        int j = 0;
        while(i < n && j < n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                res = Math.max(j - i, res);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return res;
    }
    public static int fun11(int[] arr, int root){
        if(root >= arr.length){
            return 0;
        }
        int left = fun11(arr, root * 2);
        int right = fun11(arr, root * 2 + 1);
        return arr[root] + Math.max(left, right);
    }
    public static int fun10(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = fun10(node.left);
        int right = fun10(node.right);
        return node.value + Math.max(left, right);
    }
    public static void fun10() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        String order = sc.next();
        int[][] arr = new int[n][m];
        arr[0][0] = 1;
        int x = 0;
        int y = 0;
        int sum = 1;
        int i = 0;
        for(; i < order.length(); i++){
            if(order.charAt(i) == 'W')x--;
            else if(order.charAt(i) == 'S')x++;
            else if(order.charAt(i) == 'A')y--;
            else y++;
            if(arr[x][y] == 0){
                sum++;
                arr[x][y] = 1;
            }
            if(sum == n * m) break;
        }
        if(i != order.length()){
            System.out.println("Yes " + (i + 1));
        }else{
            System.out.println("No "+ (n * m - sum));
        }
    }
    public static void fun9() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        if(n == 1) System.out.println(nums[0]);
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(nums[n - 1]);
        dq.offer(nums[n - 2]);
        for(int i = n - 3; i >= 0; i--){
            dq.offer(nums[i]);
            dq.offer(dq.poll());
            dq.offer(dq.poll());
        }
        int[] res = new int[dq.size()];
        for(int i = 0; i < n; i++){
            res[i] = dq.poll();
        }
        for(int i = n - 1; i >= 0; i--){
            System.out.print(res[i] + " ");
        }
    }

    public static void fun8(){//a[i] - a[j] = 2a[j] - a[k] 4 2 2 2
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(3 * nums[j] - nums[k] == nums[i]){
                        res++;
                    }
                }

            }
        }
        System.out.println(res);
    }
    public static void fun7() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder strb1 = new StringBuilder();
        strb1.append("MeiTuan");
        StringBuilder strb2 = new StringBuilder();
        strb2.append("MeiTuan");
        for(int i = 0; i < 25; i++){
            strb2 = new StringBuilder(strb1);
            strb2.reverse();
            strb1.append(strb2);
            strb1.append("wow");
        }
        for(int i = 0; i < t; i++){
            int index = sc.nextInt();
            System.out.println(strb1.charAt(index - 1));
        }
    }
    public static void fun6() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] in = new int[m];
        for(int i = 0; i < m; i++){
            in[i] = sc.nextInt();
        }
        List<List<Integer>> list = new ArrayList();
        for(int i = 0; i < n; i++){
            list.add(new ArrayList());
        }
        for(int i = 0; i < m; i++){
            list.get(in[i] - 1).add(i);
        }
        List<Integer> list_train = new ArrayList();
        List<Integer> list_test = new ArrayList();
        for(int i = 0; i < list.size(); i++){
            List<Integer> tmp_list = list.get(i);
            int end = 0;
            if(tmp_list.size() % 2 == 1){
                end = tmp_list.size() / 2 + 1;
            }else{
                end = tmp_list.size() / 2;
            }
            for(int j = 0; j < end; j++){
                list_train.add(tmp_list.get(j));
            }
            for(int j = end; j < tmp_list.size(); j++){
                list_test.add(tmp_list.get(j));
            }
        }
        Collections.sort(list_train);
        for(int i = 0; i < list_train.size(); i++){
            System.out.print(list_train.get(i) + 1 + " ");
        }
        System.out.println();
        Collections.sort(list_test);
        for(int i = 0; i < list_test.size(); i++){
            System.out.print(list_test.get(i) + 1 + " ");
        }
    }
    public static void fun5(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] in = new int[m];
        for(int i = 0; i < m; i++){
            in[i] = sc.nextInt();
        }
        List<Map<Integer, Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Map<Integer, Integer>  map = new HashMap<>();
            for(int j = 0; j < m; j ++){
                if(in[j] == i + 1){
                    map.put(j + 1, i + 1);
                }
            }
            list.add(map);
        }
        Set<Integer> train = new TreeSet<>();
        Set<Integer> test = new TreeSet<>();
        for(Map<Integer, Integer> tmp_map : list){
            int size = tmp_map.size();
            int size_train = 0;
            if(size % 2 == 0){
                size_train = size / 2;
            }else{
                size_train = size / 2 + 1;
            }
            int count = 0;
            for(Object key : tmp_map.keySet()){
                if(count < size_train){
                    train.add((Integer) key);
                }else{
                    test.add((Integer) key);
                }
                count++;
            }
        }
        for(Integer tr : train){
            System.out.print(tr + " ");
        }
        System.out.println();
        for(Integer te : test){
            System.out.print(te + " ");
        }
    }
    public static void fun4() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i = 0; i < t; i++){
            arr[i] = sc.nextInt();
        }
        int[] arrleft = new int[t];
        int[] arrright = new int[t];
        int tmp1 = 0;
        for(int i = 0; i < t; i++){
            if(arr[i] > 0){
                arrleft[i] = ++tmp1;
            }else{
                arrleft[i] = tmp1;
            }
        }
        int tmp2 = 0;
        for(int i = t - 1; i >= 0; i--){
            if(arr[i] < 0){
                arrright[i] = ++tmp2;
            }else{
                arrright[i] = tmp2;
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < t; i++){
            if(arr[i] == 0){
                res = Math.min(res, arrleft[i] + arrright[i] + 1);
            }else{
                res = Math.min(res, arrleft[i] + arrright[i]);
            }
        }
        System.out.println(res);
    }
    public static void fun3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(2 * A <= B){
                System.out.println(A);
                continue;
            }
            if(2 * B <= A){
                System.out.println(B);
                continue;
            }
            int nums = Math.min(A, B);
            int s = 1;
            int e = nums - 1;
            while(s <= e){
                int mid = (e - s) / 2 + s;
                if(mid * 3 < A + B){
                    s = mid + 1;
                }else{
                    e = mid - 1;
                }
            }
            System.out.println(s);
        }
    }
    int m_path = 0;
    public static void maxPath(TreeNode node){
        if(node == null){
            return;
        }

    }
    public static  void fun() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        List<Integer>[] adj = new ArrayList[n];
        for(int i = 0; i < n; i++){
            adj[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < m; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int fee = sc.nextInt();
            adj[start].add(end);
            adj[end].add(start);
            map.put(start + "#" + end, fee);
            map.put(end + "#" + start, fee);
        }
    }
//    private static void swap(ArrayList<Integer> num, int i1, int i2){
//        int temp = num.get(i1);
//        num.set(i1, num.get(i2));
//        num.set(i2, temp);
//    }

    public static void recursion(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> num, int index){
        //分枝进入结尾，找到一种排列
        if(index == num.size() - 1){
            res.add(num);
        }else{
            //遍历后续的元素
            for(int i = index; i < num.size(); i++){
                //交换二者
                swap(num, i, index);
                //继续往后找
                recursion(res, num, index + 1);
                //回溯
                swap(num, i, index);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> permute(int[] num) {
        //先按字典序排序
        Arrays.sort(num);
        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        //数组转ArrayList
        for(int i = 0; i < num.length; i++)
            nums.add(num[i]);
        recursion(res, nums, 0);
        return res;
    }
    static  int sum = 0;
    public static void fun(List<List<Integer>> res, int[] arr, int i){
        if(i == arr.length - 1){
//            System.out.println(sum++);
//            List<Integer> tmp = new ArrayList<>();
//            for(int j = 0; j < arr.length - 1; j++){
//                tmp.add(arr[j]);
//            }
//            res.add(tmp);
            if(isTrue(arr)){
                List<Integer> tmp = new ArrayList<>();
                for(int j = 0; j < arr.length; j++){
                    tmp.add(arr[j]);
                }
                res.add(tmp);
            }
            return;
        }
        for(int j = i; j < arr.length; j++){
            swap(arr, i, j);
            fun(res, arr, i + 1);
            swap(arr, i, j);
        }
//        for(int j = i; j < arr.length - 1; j++){
//            for(int k = j; k < arr.length; k++){
//                swap(arr, j, k);
//                fun(res, arr, i + 1);
//                swap(arr, j, k);
//            }
//        }

    }
    public static boolean isTrue(int[] arr){
        int target = arr[0] * arr[1] * arr[2];
        if(target == arr[3] * arr[4] * arr[5] &&
                target == arr[6] * arr[7] * arr[8] &&
                target == arr[0] * arr[4] * arr[8] &&
                target == arr[6] * arr[4] * arr[2] &&
                target == arr[0] * arr[3] * arr[6] &&
                target == arr[1] * arr[4] * arr[7] &&
                target ==  arr[2] * arr[5] * arr[8]){
            return true;
        }
        return false;
//        int[][] grid = new int[3][3];
//        for(int i = 0; i < arr.length; i++){
//            grid[i / 3][i % 3] = arr[i];
//        }
//        int target = 1;
//        for(int i = 0; i < 3; i++){
//            target *= grid[i][i];
//        }
//        for(int i = 0; i < 3; i++){
//            if(!row(grid[i], target)){
//                return false;
//            }
//        }
//        for(int j = 0; j < 3; j++){
//            int times = 1;
//            for(int i = 0; i < 3; i++){
//                times *= grid[i][j];
//            }
//            if(target != times){
//                return false;
//            }
//        }
//        int mutil = 1;
//        for(int i = 2; i >= 0; i--){
//            mutil *= grid[i][2 - i];
//        }
//        if(target != mutil){
//            return false;
//        }
//        return true;
    }
    public static boolean row(int[] arr, int target){
        int times = 1;
        for(int i = 0; i < arr.length; i++){
            times *= arr[i];
        }
        return target == times;
    }
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static int  fun(String s){
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '+' || s.charAt(i) == '-'){
                res += 1;
            }else if(s.charAt(i) == '*'){
                res += 2;
            }else if(s.charAt(i) == '/'){
                res += 4;
            }
        }
        return res;
    }
    public ArrayList<Integer> function2(String s, int index){
        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        char op = '+';
        int i;
        for(i = index; i < s.length(); i++){
            //数字转换成int数字
            //判断是否为数字
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                num = num * 10 + s.charAt(i) - '0';
                if(i != s.length() - 1)
                    continue;
            }
            //碰到'('时，把整个括号内的当成一个数字处理
            if(s.charAt(i) == '('){
                //递归处理括号
                ArrayList<Integer> res = function(s, i + 1);
                num = res.get(0);
                i = res.get(1);
                if(i != s.length() - 1)
                    continue;
            }
            switch(op){
                //加减号先入栈
                case '+':
                    stack.push(num);
                    break;
                case '-':
                    //相反数
                    stack.push(-num);
                    break;
                //优先计算乘号
                case '*':
                    int temp = stack.pop();
                    stack.push(temp * num);
                    break;
            }
            num = 0;
            //右括号结束递归
            if(s.charAt(i) == ')')
                break;
            else
                op = s.charAt(i);
        }
        int sum = 0;
        //栈中元素相加
        while(!stack.isEmpty())
            sum += stack.pop();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(sum);
        temp.add(i);
        return temp;
    }
    public int solve3 (String s) {
        ArrayList<Integer> res = function(s, 0);
        return res.get(0);
    }
    //表达式求值
    public static ArrayList<Integer> function(String s, int index){
        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        char op = '+';
        int i;
        for(i = index; i < s.length(); i++){
            //数字转换成int数字
            //判断是否为数字
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                num = num * 10 + s.charAt(i) - '0';
                if(i != s.length() - 1)
                    continue;
            }
            //碰到'('时，把整个括号内的当成一个数字处理
            if(s.charAt(i) == '('){
                //递归处理括号
                ArrayList<Integer> res = function(s, i + 1);
                num = res.get(0);
                i = res.get(1);
                if(i != s.length() - 1)
                    continue;
            }
            switch(op){
                //加减号先入栈
                case '+':
                    stack.push(num);
                    break;
                case '-':
                    //相反数
                    stack.push(-num);
                    break;
                //优先计算乘号
                case '*':
                    int temp = stack.pop();
                    stack.push(temp * num);
                    break;
            }
            num = 0;
            //右括号结束递归
            if(s.charAt(i) == ')')
                break;
            else
                op = s.charAt(i);
        }
        int sum = 0;
        //栈中元素相加
        while(!stack.isEmpty())
            sum += stack.pop();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(sum);
        temp.add(i);
        return temp;
    }
    public int solve (String s) {
        ArrayList<Integer> res = function(s, 0);
        return res.get(0);
    }

    public static int maxProfit (int[] prices) {
        // write code here
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                return o2 - o1;
            }
        });
        int bottom = prices[0];
        int res = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){
                continue;
            }else{
                if(prices[i - 1] > bottom){
                    pq.offer(prices[i - 1] - bottom);
                }
                bottom = prices[i];
            }
        }
        if(prices[prices.length - 1] > bottom){
            pq.offer(prices[prices.length - 1] - bottom);
        }
        if(pq.size() >= 2){
            return pq.poll() + pq.poll();
        }
        return pq.poll();
    }
    public static int longestValidParentheses (String s) {
        // write code here
//         int[] dp = new int[s.length() + 1];
        int ans = 0;
        int res = 0;
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        int start = -1;
        for(int i = 0; i < s.length(); i++){
//             if(s.charAt(i) ==  '('){
//                 dq.push(s.charAt(i));
//             }else{
//                 if(dq.size() > 0){
//                     ans += 2;
//                     dq.pop();
//                 }else{
//                     res = Math.max(res, ans);
//                     ans = 0;
//                 }
//             }
            if(s.charAt(i) == '('){
                dq.push(i);
            }else{
                if(dq.size() > 0){
                    dq.pop();
                    if(!dq.isEmpty()){
                        res = Math.max(res, i - dq.peek());
                    }else{
                        res = Math.max(res, i - start);
                    }
                }else{
                    start = i;
                }
            }
        }
        return Math.max(res, ans);
    }

    public static  void fun(int n, List<Integer> listForTest){
        int[][] arr = new int[10][2];
        int k = 0;
        for(int i = 0; i < 5; i++){
            for(int j = i + 1; j < 5; j++){
                arr[k++] = new int[]{i, j};
            }
        }
        Set<String> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add(0);
        }
        fun(set, list, 0, arr);
        StringBuilder strB = new StringBuilder();
        for(int i = 0; i < listForTest.size(); i++){
            strB.append(listForTest.get(i));
            strB.append("#");
        }
        System.out.println(set.size() < n);
        List<String> res = new ArrayList<>(set);
        Collections.sort(res);
        System.out.println(set.contains(strB.toString()));
    }
    public static void fun(Set<String> res, List<Integer> tmp, int index, int[][]arr){
        if(index == 10){
            Collections.sort(tmp, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            StringBuilder strB = new StringBuilder();
            for(int i = 0; i < tmp.size(); i++){
                strB.append(tmp.get(i));
                strB.append("#");
            }
            res.add(strB.toString());
            return;
        }
        int c1 = arr[index][0];
        int c2 = arr[index][1];

        //赢
        int score1 = tmp.get(c1);
        int score2 = tmp.get(c2);
        tmp.set(c1, score1 + 3);
//        tmp.set(c2, score2 - 3);
        fun(res, tmp,  index + 1, arr);
        tmp.set(c1, score1);
        tmp.set(c2, score2);
        //负
//        tmp.set(c1, score1 - 3);
        tmp.set(c2, score2 + 3);
        fun(res, tmp, index + 1, arr);
        tmp.set(c1, score1);
        tmp.set(c2, score2);
        //平
        tmp.set(c1, score1 + 1);
        tmp.set(c2, score2 + 1);
        fun(res, tmp, index + 1, arr);
        tmp.set(c1, score1);
        tmp.set(c2, score2);
    }
    public static int editDistance (String str1, String str2) {
        // write code here
        int n1 = str1.length();
        int n2 = str2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        for(int i = 0; i <= n1; i++){
            dp[i][0] = i;

        }
        for(int j = 0; j <= n2; j++){
            dp[0][j] = j;
        }
        for(int i = 1; i <= n1; i++){
            for(int j = 1; j <= n2;j++){
                if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }else{
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }
            }
        }
        return dp[n1][n2];
    }
    public static ArrayList<String> restoreIpAddresses (String s) {
        // write code here
        ArrayList<String> res = new ArrayList();
        int n = s.length();
        for(int i = 1; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k, n);
                    if(Integer.valueOf(s1) >= 256 || Integer.valueOf(s2) >= 256 || Integer.valueOf(s3) >= 256 || Integer.valueOf(s4) >= 256){
                        continue;
                    }else if((s1.length() > 1 && s1.charAt(0) == '0') || (s2.length() > 1 && s2.charAt(0) == '0') || (s3.length() > 1 && s3.charAt(0) == '0') || (s4.length() > 1 && s4.charAt(0) == '0')){
                        continue;
                    }else{
                        res.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }
        return res;

    }
    public static int minMoney2 (int[] arr, int aim) {
        // write code here
        int m = aim;
        int n = arr.length;
        int[] dp = new int[m + 1];
        Arrays.fill(dp, aim + 1);
        dp[0] = 0;
        for(int i = 1; i <= m; i++){
            for(int j = 0; j < n; j++){
                if(i - arr[j] < 0){
                    continue;
                }else{
                    dp[i] = Math.min(dp[i - arr[j]] + 1, dp[i]);
                }
            }
        }
        return dp[aim] == aim + 1 ? -1 : dp[aim];
    }
    public static int minMoney (int[] arr, int aim) {
        // write code here
        int m = aim;
        int n = arr.length;
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++){
            dp[i][n] = -1;
            for(int j = 0; j < n; j++){
                if(i - arr[j] < 0 || dp[i - arr[j]][n] == -1){
                    dp[i][j] = -1;
                }else{
                    dp[i][j] = dp[i - arr[j]][n] + 1;
                    if(dp[i][n] == -1){
                        dp[i][n] = dp[i][j];
                    }else{
                        dp[i][n] = Math.min(dp[i][n], dp[i][j]);
                    }
                }
            }
        }
        int res = dp[aim][n];
        if(res == Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }
    public static int solve2 (String nums) {
        // write code here
        if(nums == null || nums.length() == 0 || "0".equals(nums)){
            return 0;
        }
        int f1 = 1;
        int f2 = 1;
        int res = 1;
        for(int i = 0; i < nums.length(); i++){
            if(i != 0){
                if(nums.charAt(i - 1) >  '2'){
                    return 0;
                }
            }else{
                if(nums.charAt(i) == '0'){
                    return 0;
                }
            }
        }
        for(int i = 1; i < nums.length(); i++){
            String tmp = nums.substring(i - 1, i + 1);
            int intTmp = Integer.valueOf(tmp);
            if(nums.charAt(i) == '0' || nums.charAt(i - 1) == '0' ||intTmp > 26 ){
                res = f1;
                f2 = res;
            }else{
                res = f1 + f2;
                f1 = f2;
                f2 = res;
            }
        }
        return res;
    }
    public static int minPathSum (int[][] matrix) {
        // write code here
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i <= m; i++){
            dp[i][0] = 10000001;
        }
        for(int j = 0; j <= n; j++){
            dp[0][j] = 10000001;
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(i != 1 || j != 1){
                    dp[i][j] = matrix[i - 1][j - 1] + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }else{
                    dp[i][j] = matrix[i - 1][j - 1];
                }
            }
        }
        return dp[m][n];
    }
    public static String LCS2 (String str1, String str2) {
        // write code here
        int n1 = str1.length();
        int n2 = str2.length();
        int[][] dp = new int[n2 + 1][n1 + 1];
        for(int i = 1; i <= n2; i++){
            for(int j = 1; j <= n1; j++){
                if(str2.charAt(i - 1) == str1.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        int res = 0;
        int end = 0;
        for(int i = 1; i <= n2; i++){
            for(int j = 1; j <= n1; j++){
                if(res < dp[i][j]){
                    end = i;
                    res = dp[i][j];
                }
            }
        }
        int start = end - res;
        return str2.substring(start, end);
    }
    public static String LCS (String s1, String s2) {
        // write code here
        int n1 = s1.length();
        int n2 = s2.length();
        int[][] dp = new int[n2 + 1][n1 + 1];

        for(int i = 1; i <= n2; i++){
            for(int j = 1; j <= n1; j++){
                if(s2.charAt(i - 1) == s1.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        StringBuilder strb = new StringBuilder();
        int i = n2;
        int j = n1;
        while(i > 0 && j > 0 && dp[i][j] != 0){
            if(dp[i][j] == dp[i - 1][j]){
                i--;
            }else if(dp[i][j] == dp[i][j - 1]){
                j--;
            }else{
                strb.append(s2.charAt(i - 1));
                i--;
                j--;
            }
        }
        return strb.reverse().toString();
    }

    static private int[][] dirs = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static private int n, m;
    //深度优先搜索，返回最大单元格数
//    int[][] dirs = new int[][]{{-1, 0},{1, 0}, {0, 1}, {0, -1}};
    public static int solve (int[][] matrix) {
        // write code here
        int res = 0;
        int n = matrix.length;
        int[][] dp = new int[n][n];
        dp[0][0] = 1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                dfs(matrix, dp, i, j);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res = Math.max(dp[i][j], res);
            }
        }
        return res;
    }
    public static void dfs(int[][]matrix, int[][] dp, int x, int y){
        for(int i = 0; i < 4; i++){
            int nextI = dirs[i][0] + x;
            int nextJ = dirs[i][1] + y;
            if(nextI >= 0 && nextI < matrix.length && nextJ >= 0 && nextJ < matrix[0].length){
                if(matrix[nextI][nextJ] > matrix[x][y]){
                    dp[nextI][nextJ] = Math.max(dp[nextI][nextJ], dp[x][y] + 1);
                    dfs(matrix, dp, nextI, nextJ);
                }else{
                    dp[nextI][nextJ] = Math.max(dp[nextI][nextJ], 1);
                }
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        Set<ArrayList<Integer>> set = new HashSet();
        ArrayList<Integer> list = new ArrayList();
        ArrayList<ArrayList<Integer>> res = new ArrayList();
        for(int i : num){
            list.add(i);
        }
        fun(set, list, 0);
        for(ArrayList<Integer> l : set){
            res.add(l);
        }
        return res;
    }
    public static void fun(Set<ArrayList<Integer>> set, ArrayList<Integer> list, int h){
        if(h == list.size()){
            set.add(new ArrayList(list));
        }
        for(int i = h; i < list.size(); i++){
            swap(list, i, h);
            fun(set, list, h + 1);
            swap(list, i, h);
        }
    }
    public static void swap(ArrayList<Integer> list, int i, int h){
        int tmp = list.get(i);
        list.set(i, list.get(h));
        list.set(h, tmp);
    }
//    public static int solve (int[][] matrix) {
//        // write code here
//        int res = 0;
//        for(int i = 0; i < matrix.length; i++){
//            for(int j = 0; j < matrix[0].length; j++){
//                res = Math.max(res, dfs(matrix, i, j));
//            }
//        }
//        return res;
//    }
    public static int dfs(int[][] matrix, int x, int y){
        int tmp = 1;
        if(x + 1 <= matrix.length - 1 && matrix[x][y] < matrix[x + 1][y]){
            tmp = dfs(matrix, x + 1, y) + 1;
        }
        if(y + 1 <= matrix[0].length - 1 && matrix[x][y] < matrix[x][y + 1]){
            tmp = Math.max(dfs(matrix, x, y + 1) + 1, tmp);
        }
        return tmp;
    }
    public static ArrayList<String> Permutation (String str) {
        // write code here
        char[] chars = str.toCharArray();
        Set<String> set = new HashSet();
        boolean[] visited = new boolean[str.length()];
        StringBuilder strB = new StringBuilder();
        dfs(chars, set, 0);
        return new ArrayList(set);
    }
    public static void dfs(char[] chars, Set<String> set, int h){
        if(chars.length == h){
            set.add(new String(chars));
            return;
        }
        for(int i = h; i < chars.length; i++){
            swap(chars, i, h);
            dfs(chars, set, h + 1);
            swap(chars, i, h);
        }
    }
    public static void swap(char[] chars, int i, int j){
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
    public static int solve (char[][] grid) {
        // write code here
        //BFS
        Queue<int[]> queue = new ArrayDeque();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    queue.offer(new int[]{i, j});
                }
            }
        }
        int res = 0;
        Set<String> set = new HashSet();
        while(!queue.isEmpty()){
            int[] cooridinate = queue.poll();
            if(set.contains(cooridinate[0] + "_" + cooridinate[1])){
                continue;
            }else{
                DFS(grid, cooridinate[0], cooridinate[1], set);
                res++;
            }
        }
        return res;

    }
    public static void DFS(char[][] grid, int x, int y, Set<String> set){
//         int x = cooridinate[0];
//         int y = cooridinate[1];

        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0' || set.contains(x + "_" + y)){
            return ;
        }
        set.add(x + "_" + y);
        DFS(grid, x - 1, y, set);
        DFS(grid, x + 1, y, set);
        DFS(grid, x, y - 1, set);
        DFS(grid, x, y + 1, set);
    }
    static boolean[] visited ;
//    public static ArrayList<ArrayList<Integer>> permute(int[] num) {
//        visited = new boolean[num.length];
//        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
//        ArrayList<Integer> tmp = new ArrayList();
//        for(int i = 0; i < num.length; i++){
//            traceBack(num, res, tmp, i);
//        }
//        traceBack(num, res, tmp, 0);
//        return res;
//    }
    public static void traceBack(int[] num, ArrayList<ArrayList<Integer>>res, ArrayList<Integer> tmp, int j){
        if(j >= num.length){
            if(tmp.size() == num.length){
                res.add(new ArrayList(tmp));
            }
            return;
        }
        tmp.add(num[j]);
        visited[j] = true;
        traceBack(num, res, tmp, j + 1);
        visited[j] = false;
        tmp.remove(tmp.size() - 1);
        traceBack(num, res, tmp, j + 1);
    }
    public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        if(num.length <= 2){
            return null;
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList();
        Set<ArrayList<Integer>> set = new HashSet();
        for(int i = 0; i < num.length; i++){
            Map<Integer, Integer> map = new HashMap();
            int target = num[i];
            ArrayList<Integer> tmp = new ArrayList();
            for(int j = i + 1; j < num.length; j++){
                if(map.containsKey(-target - num[j])){
                    tmp.add(target);
                    tmp.add(num[j]);
                    tmp.add(-target - num[j]);
//                     Collections.sort(tmp);
                    set.add(tmp);
                }else{
                    map.put(num[j], j);
                }
            }
        }
        for(ArrayList<Integer> arrayList : set){
            res.add(arrayList);
        }
        return res;
    }
}
