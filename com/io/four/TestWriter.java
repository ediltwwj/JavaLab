package com.io.four;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;


// 将工程的默认编码改为UTF8
// 当使用GBK去解码的时候产生乱码， 由于GBK和UTF8的编码规则不一样故出现乱码

public class TestWriter {
    public static void main(String[] args) {
        String fileName = "./six.txt";
        try {
            //Writer fw = new OutputStreamWriter(new FileOutputStream(fileName), "GBK");
            Writer fw = new OutputStreamWriter(new FileOutputStream(fileName));
            fw.write("大家好");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
