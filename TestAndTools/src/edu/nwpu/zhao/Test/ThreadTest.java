package edu.nwpu.zhao.Test;

/**
 * @author:weilongzhao
 * @time:2022/7/23 12:11
 */
public class ThreadTest {
    static class Eating implements Runnable{
        Object rescource1 = new Object();
        Object rescource2 = new Object();
        int flag = 0;
        @Override
        public void run() {
            if(flag == 0){
                synchronized (rescource1){
                    try {
                        Thread.sleep(50000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (rescource2){
                        System.out.println("已有rescource2 ,获得rescource1");
                    }
                }
            }else{
                synchronized (rescource2){
                    try {
                        Thread.sleep(50000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (rescource1){
                        System.out.println("已有rescource1 ,获得rescource2");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Eating e1 = new Eating();
        Eating e2 = new Eating();
        e1.flag = 0;
        e2.flag = 1;
        Thread thread1 = new Thread(e1);
        Thread thread2 = new Thread(e2);
        thread1.start();
        thread2.start();
    }
}
