package com.hk.exer2;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author: memory
 * @create: 2020-09-28 20:26
 */
public class CarTest {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Car c1 = new Car("奔驰",25000);
        Car c2 = new Car("宝马",35000);
        Car c3 = new Car("劳斯莱斯",55000);
        Car c4 = new Car("大众",15000);
        Car c5 = new Car("红旗",45000);
        hashSet.add(c1);
        hashSet.add(c2);
        hashSet.add(c3);
        hashSet.add(c4);
        hashSet.add(c5);

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*******************************");
        for(Object o:hashSet){
            System.out.println(o);
        }


    }
}
