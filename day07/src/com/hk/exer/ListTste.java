package com.hk.exer;



import java.awt.*;
import java.util.*;

/**
 * @title: ListTste
 * @Description:
 * @Author: memory
 * @Date: 2020-09-28 14:23
 * @Version: 1.0
 */
public class ListTste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList arrayList = new ArrayList();
        TreeSet treeSet = new TreeSet();

        for (int i = 1;i<=10;i++){
            System.out.println("请输入第"+i+"个整数");
            Integer i1 = scanner.nextInt();
//            arrayList.add(String.valueOf(i1));
            treeSet.add(i1);

        }
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


//




    }


}
