package com.hk.exer1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @title: DateTest
 * @Description:
 * @Author: memory
 * @Date: 2020-09-24 09:17
 * @Version: 1.0
 */
public class DateTest {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = simpleDateFormat.parse("2017-08-16");

        java.sql.Date date = new java.sql.Date(parse.getTime());
        System.out.println(parse);
        System.out.println(parse.getTime());
        System.out.println(date);
    }
    Calendar calendar = Calendar.getInstance();

}
