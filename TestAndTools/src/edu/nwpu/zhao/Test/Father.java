package edu.nwpu.zhao.Test;

/**
 * @author:weilongzhao
 * @time:2021/8/1 15:12
 */

public class Father<T> {
    static class Child extends Father{
        @Override
        public void test() throws Exception{
            System.out.println("child");
        }
    }
//    private int num = 0;
//    protected void f() throws Exception{
//        System.out.println("FAHTER");
//    }
//    //参数次序个数类型不同即可
//    public void f(int a,double b){
//
//    }
//    public abstract T f(double a,int b);
    public static void main(String[] args) {
        Father father = new Father();
        Child child = new Child();
        try{
            father.test();
            child.test();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void test() throws RuntimeException, Exception {
        System.out.println("father");
    }
}

