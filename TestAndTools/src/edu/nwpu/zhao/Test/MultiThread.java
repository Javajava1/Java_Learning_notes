package edu.nwpu.zhao.Test;

import java.util.concurrent.*;

/**
 * @author:weilongzhao
 * @time:2021/8/3 16:44
 */
public class MultiThread {
    public static void main(String[] args) {
        ExecutorService threadPool = new ThreadPoolExecutor(
                3,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());
        for(int i = 1;i<=9;i++){
            threadPool.execute(()->{
                System.out.println(Thread.currentThread().getName()+"\t办理业务");
            });

        }

    }
}
