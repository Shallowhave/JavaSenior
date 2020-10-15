package com.hk.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @title: ListFiles
 * @Description:
 * @Author: memory
 * @Date: 2020-10-10 13:04
 * @Version: 1.0
 */
public class ListFiles {

    public static void main(String[] args) {
        File dir = new File(System.getProperty("user.dir"));
        System.out.println("当前工作目录为：" + dir);
        try {
            subFile(dir);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void subFile(File dir) throws IOException {
        File file = new File("文件夹目录索引.txt");
        FileWriter fw = new FileWriter(file, true);
        File[] subfiles = dir.listFiles();

        for (File f : subfiles) {
            if (f.isDirectory()) {// 文件目录
                fw.write("文件夹：" + f.getAbsolutePath() + "\n");
                subFile(f);

            } else {// 文件
                fw.write("文件：" + f.getAbsolutePath() + "\n");
            }

        }
        fw.close();
    }


}

