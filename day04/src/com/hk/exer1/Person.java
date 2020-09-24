package com.hk.exer1;

import java.awt.*;

/**
 * @title: Person
 * @Description:
 * @Author: memory
 * @Date: 2020-09-24 09:59
 * @Version: 1.0
 */
public class Person implements Comparable{
    private String name;
    private int age;


    @Override
    public int compareTo(Object o) {
        if ( o instanceof Person){
            Person o1 = (Person) o;
            return this.name.compareTo(o1.name);
            }
        else {
            throw new RuntimeException("传入的数据类型不匹配");
        }

    }
}
