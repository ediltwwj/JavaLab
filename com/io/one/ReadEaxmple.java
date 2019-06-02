package com.io.one;

import java.io.*;

public class ReadEaxmple {
    public static void main(String[] args) {
        String fileName = "D:\\编程\\JavaLab\\com\\io\\one\\demo1.txt";
        File file = new File("D:\\编程\\JavaLab\\com\\io\\one", "hello.txt");
        File tempFile = new File(fileName);
        try {
            FileReader inOne = new FileReader(file);// 创建指向文件file的输入流。
            BufferedReader inTwo = new BufferedReader(inOne);// 创建指向inOne file的输入流。
            FileWriter tofile = new FileWriter(tempFile);// 创建指向文件tempFile的输出流。
            BufferedWriter out = new BufferedWriter(tofile);// 创建指向tofile的输出流。
            String s = null;
            int i = 0;
            s = inTwo.readLine();//inTwo读取一行。
            while (s != null) {
                i++;
                out.write(i + " " + s);
                out.newLine();
                s = inTwo.readLine();//inTwo读取一行。
            }
            inOne.close();
            inTwo.close();
            out.flush();
            out.close();
            tofile.close();
            inOne = new FileReader(tempFile);// 创建指向文件tempFile的输入流
            inTwo = new BufferedReader(inOne);// 创建指向inOne file的输入流。
            tofile = new FileWriter(file);// 创建指向文件file的输出流。
            out = new BufferedWriter(tofile);// 创建指向tofile的输出流。
            while ((s = inTwo.readLine()) != null)  ////inTwo读取一行。
            {
                out.write(s);
                out.newLine();
            }
            inOne.close();
            inTwo.close();
            out.flush();
            out.close();
            tofile.close();
            inOne = new FileReader(file);// 创建指向文件file的输入流。
            inTwo = new BufferedReader(inOne);// 创建指向inOne file的输入流。
            while ((s = inTwo.readLine()) != null)  ////inTwo读取一行。
            {
                System.out.println(s);
            }
            inOne.close();
            inTwo.close();
            tempFile.delete();
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
