package com.io.two;

import java.io.*;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        String fileName = "D:\\编程\\JavaLab\\com\\io\\demo2.txt";
        // 从键盘写入文件
        FileOutputStream fos = new FileOutputStream(fileName);
        String str = new Scanner(System.in).nextLine();
        byte[] buff = str.getBytes();
        fos.write(buff);
        fos.close();

        // 使用FileInputStream读取
        FileInputStream fis = new FileInputStream(fileName);
        int size = fis.available(); // 不加这句输出会多很多格子
        byte[] buff2 = new byte[size];
        fis.read(buff2);
        fis.close();
        System.out.println("使用FileInputStream输出文件内容 : ");
        System.out.println(new String(buff2));

        // 从文件读取
        Scanner sc = new Scanner(new File(fileName));
        System.out.println("使用Scanner输出文件内容 : ");
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }


    }
}
