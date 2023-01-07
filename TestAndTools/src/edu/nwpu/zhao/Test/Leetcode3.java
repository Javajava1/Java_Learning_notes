package edu.nwpu.zhao.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static edu.nwpu.zhao.Test.Leetcode.reverse;

/**
 * @author:weilongzhao
 * @time:2022/9/24 18:57
 */
class FreqStack {
    Map<Integer, Integer> ele_fre;
    Map<Integer, List<Integer>> fre_list;
    int max = 0;
    public FreqStack() {
        ele_fre = new HashMap<>();
        fre_list = new HashMap<>();
    }

    public void push(int val) {
        ele_fre.put(val, ele_fre.getOrDefault(val, 0) + 1);
        int fre = ele_fre.get(val);
        List<Integer> list = fre_list.getOrDefault(fre, new ArrayList<>());
        list.add(val);
        fre_list.put(fre, list);
        max = Math.max(fre, max);
    }

    public int pop() {
        List<Integer> tmp = fre_list.get(max);
        int val = tmp.remove(tmp.size() - 1);
        ele_fre.put(val, max - 1);
        if(tmp.size() == 0){
            fre_list.remove(max);
            max--;
        }
        return val;
    }
}
public class Leetcode3 {
    public static void main(String[] args) throws Exception {
//        fun2();
//        System.out.println(maximumSum(new int[]{1, -1, -1, 4}));
//        fun3();
//        fun4();
//        System.out.println(daysBetweenDates("2019-12-31", "2120-01-15"));
//        System.out.println(getText(new String[]{"北京到上海的火车票", "上海到北京的飞机票", "北京周边游玩", "上海迪士尼乐园"}));
//        int num = 10;
//        System.out.println(fun4(num));
//        List<Integer> parent = new ArrayList<>();
//        List<Integer> values = new ArrayList<>();
//        parent.add(-1);
//        values.add(-5);
//        bestSumDownwardTreePath(parent, values);
//        ListNode a1 = new ListNode(1);
//        ListNode a2 = new ListNode(1);
//        ListNode a3 = new ListNode(1);
////        ListNode a4 = new ListNode(1);
//        a1.next = a2;
//        a2.next = a3;
////        a3.next = a4;
//        ListNode b1 = new ListNode(1);
//        ListNode b2 = new ListNode(0);
//        ListNode b3 = new ListNode(1);
//        b1.next = b2;
//        b2.next = b3;
//        xorList(a1, b1);
//        fun6();
//        System.out.println(fun7("acfcdfghbb"));
//        ArrayList<Double> list = new ArrayList<>();
//        list.add(10000.0);
//        list.add(10000.0);
//        list.add(10000.0);
//        list.add(10000.0);
//        list.add(10000.0);
//        list.add(10000.0);
//        list.add(10000.0);
//        list.add(10000.0);
//        list.add(10000.0);
//        list.add(10000.0);
//        list.add(10000.0);
//        list.add(10000.0);
//
//        List<String> res = calcTax(list);
//        System.out.println(res);
//        ArrayList<ArrayList<Integer>> poly1 = new ArrayList<>();
//        ArrayList<Integer> l1 = new ArrayList<>();
//        l1.add(4);
//        l1.add(5);
//        poly1.add(l1);
//
//        ArrayList<Integer> l2 = new ArrayList<>();
//        l2.add(1);
//        l2.add(1);
//        poly1.add(l2);
//
//        ArrayList<ArrayList<Integer>> poly2 = new ArrayList<>();
//        ArrayList<Integer> l3 = new ArrayList<>();
//        l3.add(4);
//        l3.add(5);
//        poly2.add(l3);
//
//        ArrayList<Integer> l4 = new ArrayList<>();
//        l4.add(1);
//        l4.add(2);
//        poly2.add(l4);
//        ArrayList<ArrayList<Integer>> res = addPolynomial(poly1, poly2);
//        System.out.println(res);
        System.out.println(categorizeBox(2909, 3968, 3272, 727));
    }
    /**
     * @author:weilongzhao
     * @time:2023/1/8
     * leetcode 双周赛  6289. 查询数组 Xor 美丽值
     */
    class Solution {
        public int xorBeauty(int[] nums) {
            //设nums中有x个在第k位的比特值为1，（a|b）& c在第k位也是1的情况有(n^2-(n - x)^2)*x种。这是因为a|b在第k位不为0的情况有（n-x）^ 2，为
            //1的情况有n^2-(n - x)^2种，由于还需要&上c，所以（a|b）& c最后一共有(n^2-(n - x)^2)*x种在第k位的比特值为1，化简可知，(n^2-(n - x)^2)*x = 2nx^2 - x^3。奇偶性取决于x的个数，如果有奇数个，第k位就为奇数1异或，第k位的值为1，否则为偶数，第k位就为偶数1异或，该位的值为0。
            //最后的结论是，美丽值是否的第k位是否为1，取决于nums数组有多少个数第k位为1。
            int res = 0;
            for(int i : nums){
                res ^= i;
            }
            return res;
        }
    }
    /**
     * @author:weilongzhao
     * @time:2023/1/8
     * leetcode 双周赛  6288. 找到数据流中的连续整数
     */
    class DataStream {
        List<Integer> list ;
        int value ;
        int k ;
        int sum = 0;
        public DataStream(int value, int k) {
            this.value = value;
            this.k = k;
            list = new ArrayList<>();
        }
        public boolean consec(int num) {
            if(num == value){
                list.add(1);
                sum += 1;
            }else{
                list.add(0);
            }
            if(list.size() < k){
                return false;
            }else if (list.size() == k){
                if(sum == k){
                    return true;
                }else{
                    return false;
                }
            }else{
                sum -= list.get(list.size() - k - 1);
                if(sum == k){
                    return true;
                }else{
                    return false;
                }
            }

        }
    }
    /**
     * @author:weilongzhao
     * @time:2023/1/8
     * leetcode 双周赛  6287. 根据规则将箱子分类
     */
    public static  String categorizeBox(int length, int width, int height, int mass) {
        boolean heavy = false;
        boolean bulky = false;
        if(mass >= 100){
            heavy = true;
        }
        long v = (long)length * width * height;
        if(v > 1000000000 || length > 10000 || width > 10000 || height > 10000){
            bulky = true;
        }
        if(bulky && heavy){
            return "Both";
        }else if(!bulky && !heavy){
            return "Neither";
        }else if(bulky){
            return "bulky";
        }else{
            return "heavy";
        }
    }
    public static ArrayList<ArrayList<Integer>> addPolynomial (ArrayList<ArrayList<Integer>> poly1, ArrayList<ArrayList<Integer>> poly2) {
        // write code here
        PriorityQueue<ArrayList<Integer>> q1 = new PriorityQueue(new Comparator<ArrayList<Integer>>(){
            public int compare(ArrayList<Integer> l1, ArrayList<Integer> l2){
                return l2.get(1) - l1.get(1);
            }
        });
        PriorityQueue<ArrayList<Integer>> q2 = new PriorityQueue(new Comparator<ArrayList<Integer>>(){
            public int compare(ArrayList<Integer> l1, ArrayList<Integer> l2){
                return l2.get(1) - l1.get(1);
            }
        });
        for(int i = 0; i < poly1.size(); i++){
            q1.offer(poly1.get(i));
        }
        for(int i = 0; i < poly2.size(); i++){
            q2.offer(poly2.get(i));
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        while(!q1.isEmpty() && !q2.isEmpty()){
            ArrayList<Integer> p1 = q1.peek();
            ArrayList<Integer> p2 = q2.peek();
            ArrayList<Integer> p = null;
            if(p1.get(1) == p2.get(1)){
                p = new ArrayList<>();
                int n = p1.get(0) + p2.get(0);
                if(n != 0){
                    int index = p1.get(1);
                    p.add(n);
                    p.add(index);
                    res.add(p);
                }
                q1.poll();
                q2.poll();
            }else if(p1.get(1) > p2.get(1)){
                p = new ArrayList<>();
                p.add(p1.get(0));
                p.add(p1.get(1));
                q1.poll();
                res.add(p);
            }else{
                p = new ArrayList<>();
                p.add(p2.get(0));
                p.add(p2.get(1));
                q2.poll();
                res.add(p);
            }
        }
        while(!q1.isEmpty()){
            ArrayList<Integer> t = q1.poll();
            res.add(t);
        }
        while(!q2.isEmpty()){
            ArrayList<Integer> t = q2.poll();
            res.add(t);
        }
        return res;
    }
    public static ArrayList<String> calcTax (ArrayList<Double> income) {
        // write code here
        ArrayList<String> res = new ArrayList<>();
        double sum = 0;
        for(int i = 0; i < income.size(); i++){
            double fa = income.get(i);
            fa -= 5000;
            if(fa < 0){
                res.add("0");
            }else{
                double tax = 0.0;
                if(sum + fa <= 36000){
                    tax = fa * 0.03;
                }else if(sum < 36000 && sum + fa > 36000){
                    tax = (36000 - sum) * 0.03 + (sum + fa - 36000) * 0.1;
                }else if(sum + fa >= 36000 && sum + fa <= 144000){
                    tax = fa * 0.1;
                }else if(sum < 144000 && sum + fa >= 144000){
                    tax = (144000 - sum) * 0.1 + (sum + fa - 144000) * 0.20;
                }else if(sum + fa > 144000 && sum + fa < 360000){
                    tax = fa * 0.25;
                }else if(sum < 360000 && sum + fa > 360000){
                    tax = (300000 - sum) * 0.2 + (sum + fa - 300000) * 0.25;
                }else if(sum + fa > 360000 && sum + fa < 420000){
                    tax = fa * 0.3;
                }else if(sum + fa > 420000 && sum + fa < 660000){
                    tax = fa * 0.3;
                }else if(sum < 660000 && sum + fa > 660000){
                    tax = (660000 - sum) * 0.3 + (sum + fa - 660000) * 0.35;
                }else if(sum > 660000 && sum + fa < 960000){
                    tax = fa * 0.35;
                }else if(sum < 960000 && sum + fa > 960000){
                    tax = (960000 - sum) * 0.35 + (sum + fa - 960000) * 0.45;
                }else{
                    tax = fa * 0.45;
                }
//                if(sum < 960000 && sum + fa >= 960000){
//                    tax = (960000 - sum) * 0.35 + (sum + fa - 960000) * 0.45;
//                }else if(sum + fa >= 960000){
//                    tax = fa * 0.45;
//                }else if(sum < 660000 && sum + fa > 660000){
//                    tax = (660000 - sum) * 0.3 + (sum + fa - 660000) * 0.35;
//                }else if(sum + fa >= 660000){
//                    tax = fa * 0.35;
//                }else if(sum < 420000 && sum + fa >= 420000){
//                    tax = (420000 - sum) * 0.25 + (sum + fa - 420000) * 0.3;
//                }else if(sum + fa >= 420000){
//                    tax = fa * 0.3;
//                }else if(sum < 300000 && sum + fa >= 300000){
//                    tax = (300000 - sum) * 0.2 + (sum + fa - 300000) * 0.25;
//                }else if(sum + fa >= 300000){
//                    tax = fa * 0.25;
//                }else if(sum < 144000 && sum + fa >= 144000){
//                    tax = (144000 - sum) * 0.1 + (sum + fa - 144000) * 0.20;
//                }else if(sum + fa > 144000){
//                    tax = fa * 0.2;
//                }else if(sum < 36000 && sum + fa >= 36000){
//                    tax = (36000 - sum) * 0.03 + (sum + fa - 36000) * 0.1;
//                }else if(sum + fa >= 36000){
//                    tax = fa * 0.1;
//                }else if(sum + fa < 36000){
//                    tax = fa * 0.03;
//                }
                res.add(String.format("%.2f", tax));
                sum += fa;
            }
        }
        return res;
    }
    public static void fun9(){
        String s = new String("abc");
        String p = s.intern();
        String q = "abc";
        System.out.println(p==s);
        System.out.println(p == q);
    }
    public static void fun8(){
        FreqStack freqStack = new FreqStack();
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(4);
        freqStack.push(5);
        System.out.println(freqStack.pop());
        System.out.println(freqStack.pop());
        System.out.println(freqStack.pop());
        System.out.println(freqStack.pop());
        System.out.println(freqStack.pop());
    }
    public static String fun7(String str){
        int res = 0;
        int start = 0;
        int l = 0;
        int r = 0;
        int[] map = new int[128];
        for(int i = 0; i < 128; i++){
            map[i] = -1;
        }
        for(int i = 0; i < str.length(); i++){
            if(map[str.charAt(i)] == -1){
                if(i - start + 1 > res){//cbfcbfgh
                    l = start;
                    r = i;
                    res = i - start + 1;
                }
            }else{
                int t = map[str.charAt(i)] + 1;
                while(start < t){
                    map[str.charAt(start)] = -1;
                    start++;
                }
            }
            map[str.charAt(i)] = i;
        }
        return str.substring(l, r + 1);
    }
    public static void fun6() throws  Exception{
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            arr[i][0] = tmp;
            arr[i][1] = getOnes(tmp);
            arr[i][2] = tmp - arr[i][1];
        }
        PriorityQueue<Integer> pq = new PriorityQueue(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int i = 0; i < n; i++){
            pq.offer(arr[i][0]);
        }
        int i = 0;
        while(i < k){
            int t = pq.poll();
            int transform = getOnes(t);
            pq.offer(transform);
            i++;
        }
        int res = 0;
        while(!pq.isEmpty()){
            res += pq.poll();
        }
        System.out.println(res);
    }
    public static void fun5() throws Exception{
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            arr[i][0] = tmp;
            arr[i][1] = getOnes(tmp);
            arr[i][2] = tmp - arr[i][1];
        }
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return b[2] - a[2];
            }
        });
        int ans = 0;
        for(int i = 0; i < k; i++){
            ans += arr[i][1];
        }
        for(int i = k; i < n; i++){
            ans += arr[i][0];
        }
        System.out.println(ans);
    }
    public static int getOnes(int num){
        int res = 0;
        for(int i = 0; i < 32; i++){
            if((num & (1 << i)) != 0){
                res++;
            }
        }
        return res;
    }
    public static ListNode xorList (ListNode a, ListNode b) {
        // write code here
        b = reverse(b);
        int len_a = getLen(a);
        int len_b = getLen(b);
        if(len_a < len_b){
            ListNode tmp = a;
            a = b;
            b = tmp;
        }
        ListNode res = new ListNode(-1);
        ListNode L = res;
        for(int i = 0; i < Math.abs(len_a - len_b); i++){
            res.next = new ListNode(a.val);
            res = res.next;
            a = a.next;
        }
        while(a != null && b != null){
            int xor = a.val ^ b.val;
            res.next = new ListNode(xor);
            res = res.next;
            a = a.next;
            b = b.next;
        }
        return L;
    }
    public static int getLen(ListNode a){
        int res = 0;
        while(a != null){
            a = a.next;
            res++;
        }
        return res;
    }

    static int res = Integer.MIN_VALUE;
    public static int bestSumDownwardTreePath(List<Integer> parent, List<Integer> values) {
        // Write your code here
        int n = parent.size();
        List<Integer>[] tree = new ArrayList[n];
        for(int i = 0; i < n; i++){
            tree[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < n; i++){
            int root = parent.get(i);
            if(root == -1){
                continue;
            }else{
                tree[root].add(i);
            }
        }
        maxPathSum(tree, 0, values);
        return res;

    }
    public static int maxPathSum(List<Integer>[] tree, int root, List<Integer> values){
//        if(tree[root].size() == 0){
//            return 0;
//        }
        int tmp = Integer.MIN_VALUE;
        for(int i = 0; i < tree[root].size(); i++){
            tmp = Math.max(tmp, maxPathSum(tree, tree[root].get(i), values));
        }
        int sum = 0;
        if(tmp > 0){
            sum = tmp + values.get(root);
        }else{
            sum = values.get(root);
        }
        res = Math.max(res, sum);
        return sum;
    }
    public static int fun4(int b){
        try {
            b += 10;
            return b;
        }catch (Exception e){

        }finally {
            b += 10;
            return b;
        }
    }
    public static String getText (String[] texts) {
        // write code here
        int len = 0;
        int minLen = Integer.MAX_VALUE;
        int secminLen = minLen;
        StringBuilder strb = new StringBuilder();
        int i;
        for(i = 0; i < texts.length;){
            for(int x = i; x <= i + 2 && x < texts.length; x++){
                len += texts[x].length();
                if(minLen > texts[x].length()){
                    secminLen = minLen;
                    minLen = texts[x].length();
                }
            }
            i += 2;
            if(i % 3 == 2){
                if(len <= 20){
                    strb.append(texts[i - 2]);
                    strb.append(" ");
                    strb.append(texts[i - 1]);
                    strb.append(" ");
                    strb.append(texts[i]);
                    strb.append(";");
                }else{
                    if(secminLen * 3 <= 20){
                        for(int j = i; j >= i - 2; j--){
                            if(texts[j].length() <= secminLen){
                                strb.append(texts[j]);
                            }else{
                                strb.append(texts[j].substring(0, texts[j].length() - minLen - secminLen));
                            }
                            if(j == i - 2){
                                strb.append(";");
                            }else{
                                strb.append(" ");
                            }
                        }
                    }else if(minLen * 3 < 20){
                        int j = 0;
                        for(j = secminLen; j >= 0; j--){
                            if(j * 2 + minLen <= 20){
                                break;
                            }
                        }
                        for(int k = i - 2; k <= i; k++){
                            if(texts[k].length() == minLen){
                                strb.append(texts[k]);
                            }else{
                                strb.append(texts[k].substring(0, j));
                            }
                            if(k != i){
                                strb.append(" ");
                            }else{
                                strb.append(";");
                            }
                        }
                    }else{
                        int j = 0;
                        for(j = minLen; j >= 0; j--){
                            if(j * 3 <= 20){
                                break;
                            }
                        }
                        strb.append(texts[i - 2].substring(0, j + 1));
                        strb.append(" ");
                        strb.append(texts[i - 1].substring(0, j + 1));
                        strb.append(" ");
                        strb.append(texts[i]).substring(0, j);
                        strb.append(";");
                    }
                }
            }
        }
        int n = texts.length;
        if(texts.length % 3 == 2){
            if(texts[n - 1].length() + texts[n - 2].length() <= 20){
                strb.append(texts[n - 2]);
                strb.append(" ");
                strb.append(texts[n - 1]);
            }else{
                int j = Math.min(texts[n - 2].length(), texts[n - 1].length());
                for(; j >= 0; j--){
                    if(2 * j <= 20){
                        break;
                    }
                }
                if(texts[n - 2].length() > j){
                    strb.append(texts[n - 2].substring(0, 20 - j));
                }else{
                    strb.append(texts[n - 2].substring(0, j));
                }
                strb.append(" ");
                if(texts[n - 1].length() > j){
                    strb.append(texts[n - 1].substring(0, 20 - j));
                }else{
                    strb.append(texts[n - 1].substring(0, j));
                }
            }
        }else{
            if(texts[texts.length - 1].length() <= 20){
                strb.append(texts[texts.length - 1]);
            }else{
                strb.append(texts[texts.length - 1].substring(0, 20));
            }
        }
        return strb.toString();
    }
    public static int daysBetweenDates (String checkInDate, String checkOutDate) {
        // write code here
        try{
            long timeIn = fun5(checkInDate);
            long timeOut = fun5(checkOutDate);
            return  (int)(timeOut - timeIn) / (1000 * 60 * 60 * 24);
        }catch(Exception e){
            System.out.println(e);
        }
        return -1;
    }
    public static long fun5(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dateIn = df.parse(date);
//        java.util.Date dateOut = df.parse(checkOutDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateIn);
        long timestamp = cal.getTimeInMillis();
        return timestamp;
    }
//    public static long fun5(String date) throws ParseException {
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        java.util.Date dateIn = df.parse(date);
////        java.util.Date dateOut = df.parse(checkOutDate);
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(dateIn);
//        long timestamp = cal.getTimeInMillis();
//        return timestamp;
////        System.out.println(timestamp);
////        System.out.println(timestamp/1000);
//    }
    public static void fun4(){
        String str = "abc#abc";
        int index = str.indexOf("abc");
        System.out.println(index);
    }
    public static void fun3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder strB = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                strB.append(str.charAt(i));
            }else if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                strB.append((char)(str.charAt(i) + 32));
            }else if(str.charAt(i) <= 'Z'){
                strB.append(str.charAt(i));
            }else{
                strB.append((char)(str.charAt(i) - 32));
            }
        }
        System.out.println(strB.toString());
    }
    public static void maximumSum1 (int[] arr) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            min = Math.min(min, arr[i]);
        }

    }
    public static int maximumSum (int[] arr) {
        // write code here
        int max = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            min = Math.min(arr[i], min);
        }
        for(int i = 0, j = arr.length - 1; i < j;){
            res = Math.max(res, sum - min);
            if(arr[i] < arr[j]){
                sum -= arr[i++];
            }else{
                sum -= arr[j--];
            }
            min = Integer.MAX_VALUE;
            for(int x = i; x <= j; x++){
                min = Math.min(min, arr[x]);
            }
        }
        return res;
    }
    public static void fun2() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int K = sc.nextInt();
        List<Integer>[] list = new ArrayList[N];
        for(int i = 0; i < N; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < N; i++){
            int n = sc.nextInt();
            list[i].add(n);
            for(int j = 0; j < n; j++){
                int tmp = sc.nextInt();
                list[i].add(tmp);
            }
        }
        int[] ans = new int[N];
        for(int i = 0; i < N; i++){
            List<Integer> mountain = list[i];
            int[] height = new int[mountain.size()];
            for(int j = 1; j < mountain.size(); j++){
                height[j] = height[j - 1] + mountain.get(j);
            }
//            for(int j = 2; j < mountain.size(); j++){
//                int pre = mountain.get(j - 1);
//                mountain.set(j, pre + mountain.get(j));
//            }
            // h, varity
            PriorityQueue<int[]> pq_first = new PriorityQueue<>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o2[0] - o1[0];
                }
            });
            PriorityQueue<int[]> pq_sec = new PriorityQueue<>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o2[0] - o1[0];
                }
            });
            pq_first.offer(new int[]{0, 0, 0});//高度, 方案数, 步数
            for(int j = 1; j < mountain.size(); j++){
                if(mountain.get(j) <= P){
                    while(!pq_first.isEmpty() && pq_first.peek()[0] > height[j] - P){
                        int[] tmp = pq_first.poll();
                        if(tmp[2] + K >= j){
                            ans[i] += tmp[1];
                        }
                        pq_sec.offer(tmp);
                    }
                    pq_sec.offer(new int[]{height[j], ans[i], j});
                    PriorityQueue<int[]> pq = pq_first;
                    pq_first = pq_sec;
                    pq_sec = pq;
                }else{
                    ans[i] = 0;
                }
            }

        }
        for(int i = 0; i < N; i++){
            System.out.println(ans[i]);
        }
    }
    static Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }else{
                return o2[0] - o1[0];
            }
        }
    });
    public static void fun1() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File("./src/input.txt"));
        System.setIn(fis);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cats = new int[N];
        for(int i = 0; i < N; i++){
            cats[i] = sc.nextInt();
        }
        List<Integer>[] streets = new ArrayList[N];
        for(int i = 0; i < N; i++){
            streets[i] = new ArrayList<>();
        }
        for(int i = 0; i < N - 1; i++){
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            streets[s1 - 1].add(s2 - 1);
        }
        queue.offer(new int[]{0,0});
        if(cats[0] <= M){
            dfs(M, streets, 0, 1, cats[0], cats);
        }
        int[] tmp = queue.poll();
        System.out.println(tmp[0] + " " + tmp[1]);
    }
    public static void dfs(int M, List<Integer>[] streets, int s, int sum, int food, int[] cats){
        if(streets[s].size() == 0){
            queue.offer(new int[]{sum, food});
            return;
        }
        for(int i = 0; i < streets[s].size(); i++){
            int next = streets[s].get(i);
            if(food + cats[next] <= M){
                dfs(M, streets, next, sum + 1, food + cats[next], cats);
            }else{
                queue.offer(new int[]{sum, food});
            }
        }
    }
}
