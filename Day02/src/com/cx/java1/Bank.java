package com.cx.java1;

/**
 * @Author cx
 * @Date 2023/02/01/21:53
 */
class Bank{

    private Bank(){

    }

    private static Bank instance = null ;

    public static synchronized Bank getInstance(){
        if(instance == null){
            instance = new Bank();
        }
        return instance;
    }
}
