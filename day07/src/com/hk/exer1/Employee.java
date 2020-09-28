package com.hk.exer1;

/**
 * @title: Employee
 * @Description:
 * @Author: memory
 * @Date: 2020-09-28 17:54
 * @Version: 1.0
 */
public class Employee implements Comparable{

    private String name;
    private int age;
    private Mydate birthday;

    public Employee() {
    }

    public Employee(String name, int age, Mydate birthday) {
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

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee o1 = (Employee) o;
            return -this.name.compareTo(o1.name);
        }
            throw  new RuntimeException("传入的数据类型不匹配");


    }
}
