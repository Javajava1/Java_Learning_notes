package edu.nwpu.zhao.demo_Genericity;

/**
 * @author:weilongzhao
 * @time:2021/8/23 21:50
 */
public class Box<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
