package com.cx.exer1;

/**
 * @Author cx
 * @Date 2023/02/02/16:11
 */
public class Clerk {

    private int productCount = 0;

    public synchronized void produceProduct(){
        if(productCount < 20){
            System.out.println(Thread.currentThread().getName() + "：开始生产第" + ++productCount + "个产品");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeProduct() {

        if(productCount > 0){
            System.out.println(Thread.currentThread().getName() + "：开始消费第" + productCount-- + "个产品");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
