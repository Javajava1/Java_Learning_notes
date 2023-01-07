package edu.nwpu.zhao.Test;

import java.util.*;

public class TestMain {
    public static void  main(String arg[]){
//        new Thread(()->{
//            for(int i = 0;i < 10;i++){
//                edu.nwpu.zhao.SingleInstanceDemo sInstance = edu.nwpu.zhao.SingleInstanceDemo.get();
//            }
//        }).start();
        // java.util.concurrentModificationExcetpion
//        ArrayList l1 = new ArrayList();
        //Collections.synchronizedList(l1)
//        System.out.println(l1.size());
//            for(int i = 0;i < 20;i++){
//                new Thread(()->{
//                    l1.add(UUID.randomUUID().toString().substring(0,8));
//                    System.out.println(l1);
//                    System.out.println(l1.size());
//                },String.valueOf(i)).start();
//            }
//        boolean []FT = new boolean[4];
//        for (int i = 0; i < 4; i++) {
//            System.out.println(FT[i]);
//        }
//        ArrayList list = new ArrayList<Integer>();//DEFAULT_CAPACITY = 10;
//        list.add(1);
//        System.out.println(list);
//        //list.set(10,1);//使用set（）方法会报越界错误
//        int [][]a = new int[1][2];
//        Queue<Integer> q = new LinkedList<Integer>();
//        q.poll();
//        System.out.println(a.length);

//        Bank b = new Bank(new long[]{10, 100, 20, 50, 30});
//
//        System.out.println(b.withdraw(3, 10));
//        System.out.println(b.transfer(5, 1, 20));
//        System.out.println(b.deposit(5, 20));
//        System.out.println(b.transfer(3, 4, 15));
//        System.out.println(b.withdraw(10, 50));
        WordDictionary wd = new WordDictionary();
        wd.addWord("bad");
        wd.addWord("dad");
        wd.addWord("mad");
        System.out.println(wd.search("pad"));
        System.out.println(wd.search("bad"));
        System.out.println(wd.search(".ad"));
        System.out.println(wd.search("b.."));
    }
    private static void caculate(int num){
        int []arr = new int[num+1];
    }
}
