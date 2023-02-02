package com.cx.java2;

import java.lang.management.ThreadInfo;

/**
 * @Author cx
 * @Date 2023/02/01/22:56
 */
class Number implements Runnable{
    private int number = 1;

    @Override
    public void run() {
        while(true){

            synchronized (this){

                notifyAll();

                if(number <= 100){
                    

                    System.out.println(Thread.currentThread().getName() + ":" + number++);

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else {
                    break;
                }
            }

        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread thread1 = new Thread(number);
        Thread thread2 = new Thread(number);

        thread1.start();
        thread2.start();
    }

}
