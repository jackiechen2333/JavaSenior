package com.cx.java;

/**
 * @Author cx
 * @Date 2023/02/01/16:17
 */
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.start();//启动当前线程。调用当前线程的run（）

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}