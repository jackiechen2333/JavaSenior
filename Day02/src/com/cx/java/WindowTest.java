package com.cx.java;

/**
 * @Author cx
 * @Date 2023/02/01/21:00
 */

class Window implements Runnable{
    private int ticket = 100;
    Object object = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized(object) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket--);
                } else {
                    break;
                }
            }
        }
    }


}

public class WindowTest {
    public static void main(String[] args) {
        Window window = new Window();
        Thread thread1 = new Thread(window);
        Thread thread2 = new Thread(window);
        Thread thread3 = new Thread(window);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
