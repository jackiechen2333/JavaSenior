package com.cx.exer;

/**
 * @Author cx
 * @Date 2023/02/07/16:10
 */
public class Empolyee implements Comparable<Empolyee> {
    private String name;
    private int age;
    private MyDate birthday;

    public Empolyee() {
    }

    public Empolyee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Empolyee o) {
        return this.name.compareTo(o.name);
    }

//    @Override
//    public int compareTo(Object o) {
//        if(o instanceof Empolyee){
//            Empolyee empolyee = (Empolyee) o;
//            return this.name.compareTo(empolyee.name);
//        }
//        throw new RuntimeException("传入的数据不一致");
//    }
}
