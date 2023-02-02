package com.cx.java2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author cx
 * @Date 2023/02/02/16:47
 */
class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumberThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}


public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(new NumberThread1());
        executorService.execute(new NumberThread2());

        executorService.shutdown();
    }
}
