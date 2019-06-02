package com.io.three;

import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        String inFileName = "D:\\编程\\JavaLab\\com\\io\\three\\input.txt";
        String outFileName = "D:\\编程\\JavaLab\\com\\io\\three\\output.txt";
        String errFileName = "D:\\编程\\JavaLab\\com\\io\\three\\err.txt";

        // 不加true，则文件无内容
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFileName));
        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream(outFileName)), true);
        PrintStream err = new PrintStream(new BufferedOutputStream(new FileOutputStream(errFileName)), true);

        System.setIn(in);
        System.setOut(out);
        System.setErr(err);

        // 输出System.in的内容
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            System.out.println(str + " wwj");
        }

        int i = 10 / 0;

        in.close();
        out.close();
        err.close();
    }
}
