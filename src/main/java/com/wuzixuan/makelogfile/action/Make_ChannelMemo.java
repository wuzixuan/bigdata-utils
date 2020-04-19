package com.wuzixuan.makelogfile.action;

import com.wuzixuan.makelogfile.utils.MakeData;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Logger;


public class Make_ChannelMemo {


    public Make_ChannelMemo() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        generateLog(10L,10000);
    }


    private static void generateLog(Long delay, int loop_len) throws IOException {
        Writer writer = new FileWriter("D:\\log.txt",true);
        for (int i = 0; i < loop_len; i++) {
            StringBuilder s = new StringBuilder();

            s.append(MakeData.getRandomString(10) + "\t");
            s.append(MakeData.getRandomChineseString(5) + "\t");
            s.append(MakeData.getRandomString(10) + "\t");
            s.append(MakeData.getRandomInt(0,10) + "\t");
            s.append(MakeData.getRandomInt(0,10) + "\t");
            s.append(MakeData.getTimeString("yyyy-MM-dd",false) + "\t");
            s.append(MakeData.getRandomString(10) + "\t");
            s.append(MakeData.getRandomString(10) + "\t");
            s.append(MakeData.getTimeString("yyyy-MM-dd",false) + "\t");
            s.append("false" + "\n");
            System.out.println(s.toString());
            writer.append(s.toString());
            // 延迟
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
        writer.close();
    }
}
