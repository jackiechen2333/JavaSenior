package com.cx.java;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Author cx
 * @Date 2023/02/10/22:18
 */
public class MethodTest {
    @Test
    public void test1(){

        Class clazz = Person.class;

        Method[] methods = clazz.getMethods();
        for (Method m : methods){
            System.out.println(m);
        }

        System.out.println();

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods){
            System.out.println(m);

        }
    }

    @Test
    public void test2(){
        Class clazz = Person.class;

        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods){
            //注解
            Annotation[] annotations = m.getAnnotations();
            for(Annotation a : annotations){
                System.out.println(a);
            }

            //权限修饰符
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");

            //返回值类型
            System.out.print(m.getReturnType().getName() + "\t");

            //方法名
            System.out.print(m.getName());
            System.out.print("(");
            //形参列表
            Class[] parameterTypes = m.getParameterTypes();
            if(! (parameterTypes == null && parameterTypes.length == 0)){
                for( int i = 0 ;i < parameterTypes. length;i++){
                    if(i == parameterTypes. length - 1){
                        System.out.print(parameterTypes[i].getName() + " args."+i);
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + " args " + i + ",");
                }
            }
            System.out.print( ")");

            //6.抛出的异常
            Class[] exceptionTypes = m.getExceptionTypes();
            if( !(exceptionTypes == null && exceptionTypes.length == 0)){
                System.out.print( "throws ");
                for(int i = 0;i < exceptionTypes.length;i++){
                    if(i == exceptionTypes.length - 1){
                        System.out.print(exceptionTypes[i].getName( ));
                        break;
                    }
                    System.out.print(exceptionTypes[i].getName() + ",");
                }
                System.out.println();
            }


        }

    }

}

