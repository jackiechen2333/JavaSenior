package com.cx.java;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Author cx
 * @Date 2023/02/10/21:49
 */
public class FieldTest {
    @Test
    public void test(){
        Class clazz = Person.class;
        //获取类及其父类中的声明为public的属性
        Field[] fields = clazz.getFields();
        for(Field f : fields){
            System.out.println(f);
        }

        System.out.println();

        //获取当前类的声明的所有的属性（不包含父类中的）
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            System.out.println(f);
        }
    }

    @Test
    public void test1(){
        Class clazz = Person.class;
        //获取类及其父类中的声明为public的属性
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            int modifiers = f.getModifiers();
//            System.out.println(modifiers);
            System.out.print(Modifier.toString(modifiers) + "\t");

            Class type = f.getType();
            System.out.print(type.getName() + "\t");

            String name = f.getName();
            System.out.println(name + "\t");
        }
    }
}
