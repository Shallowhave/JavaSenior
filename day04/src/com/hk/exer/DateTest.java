package com.hk.exer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @title: DateTest
 * @Description:
 * @Author: memory
 * @Date: 2020-09-23 15:03
 * @Version: 1.0
 */

/*
练习1：字符串“2020-09-08”转换为java.sql.date
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
        String s1 = "2020-09-08";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(s1);
        System.out.println(parse);
        System.out.println(parse.getTime());
        java.sql.Date date = new java.sql.Date(parse.getTime());
        System.out.println(date.toString());
    }
}
/*
练习2：三天打鱼两天晒网   1990-01-01,    2020-09-23
 */
class DateTest2{

    public static void main(String[] args) throws ParseException {
        String s1 = "1990-01-01";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要查询的日期（yyyy-MM-dd）：");
        String s2 = scanner.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse1 = simpleDateFormat.parse(s1);
        Date parse2 = simpleDateFormat.parse(s2);
        long time1 = parse1.getTime();
        long time2 = parse2.getTime();
        long l = time2 - time1;
        int l1 =(int)(l / (1000 * 60 * 60 * 20) + 1);
        int l2 = l1 % 5;
        if (l2 ==1|| l2 ==2||l2 ==3){
            System.out.println("他在打渔");
            System.out.println(l2);
        }else {
            System.out.println("他在晒网");
            System.out.println(l2);
        }
//        System.out.println(l1);

    }




}
