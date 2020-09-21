package com.hk.exer;

/**
 * @author: memory
 * @create: 2020-09-21-23:33
 */
public class ThreadTest {
    public static void main(String[] args) {
//        ThreadDeme threadDeme = new ThreadDeme();
//        threadDeme.start();
        new ThreadDeme(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }

                }
            }
        }.start();
    }
}
