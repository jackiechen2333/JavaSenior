package com.cx.exer;

/**
 * @Author cx
 * @Date 2023/02/08/9:11
 */
public class Test  {
}

class Father<T1,T2> {}
//子类不保留父类的泛型
//1)没有类型擦除

class Son<A,B> extends Father{//等价于class Son extends Father<Object,Object>
}

// 2)具体类型
class Son2<A,B> extends Father<Integer,String> {}

//子类保留父类的泛型
// 1)全部保留
class Son3<T1,T2,A,B> extends Father<T1,T2> {}

//2)部分保留
class Son4<T2,A,B> extends Father<Integer,T2>{}
