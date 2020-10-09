package com.hk.exer;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @title: FileDemo
 * @Description:
 * @Author: memory
 * @Date: 2020-09-30 10:37
 * @Version: 1.0
 */
public class FileDemo {
    @Test
    public void test() throws IOException {
        File file = new File("D:\\MyCode\\JavaCode\\IO");
        File ioTest = new File(file.getParent(), "IoTest");
        boolean mkdir = ioTest.mkdir();
        
//        boolean newFile = ioTest.createNewFile();

//        boolean delete = ioTest.delete();
        if (mkdir){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }
//        if (delete){
//            System.out.println("删除成功");
//        }else {
//            System.out.println("删除失败");
//        }
        }
    }

