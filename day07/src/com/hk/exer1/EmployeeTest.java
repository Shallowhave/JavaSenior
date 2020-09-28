package com.hk.exer1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @title: EmployeeTest
 * @Description:
 * @Author: memory
 * @Date: 2020-09-28 17:59
 * @Version: 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("张三",18,new Mydate(1997,2,7));
        Employee e2 = new Employee("李四",20,new Mydate(1998,7,12));
        Employee e3 = new Employee("王麻子",16,new Mydate(2000,12,26));
        Employee e4 = new Employee("jeck",26,new Mydate(1991,3,18));
        Employee e5 = new Employee("张无忌",33,new Mydate(1880,7,24));


        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee){
                    Employee o11 = (Employee) o1;
                    Employee o21 = (Employee) o2;
                    Mydate b1 = o11.getBirthday();
                    Mydate b2 = o21.getBirthday();
                    int i = b1.getYear() - b2.getYear();
                    if (i!=0){
                        return i;
                    }
                    int i1 = b1.getMonth() - b2.getMonth();
                    if (i1!= 0){
                        return i1;
                    }
                    return b1.getDay()-b2.getDay();
                }
                throw new RuntimeException("传入的数据类型不匹配");
            }
        });

        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
