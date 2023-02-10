package com.cx.java;

import java.io.Serializable;

/**
 * @Author cx
 * @Date 2023/02/10/21:52
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }

}
