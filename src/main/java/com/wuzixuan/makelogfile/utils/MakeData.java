package com.wuzixuan.makelogfile.utils;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MakeData {
    /**
     * 生成单个汉字
     */
    public static char  getRandomChar() {

        String str = "";
        int hightPos; //
        int lowPos;
        Random random = new Random();
        hightPos = (176 + Math.abs(random.nextInt(39)));
        lowPos = (161 + Math.abs(random.nextInt(93)));

        byte[] b = new byte[2];
        b[0] = (Integer.valueOf(hightPos)).byteValue();
        b[1] = (Integer.valueOf(lowPos)).byteValue();

        try {
            str = new String(b, "GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("错误");
        }

        return str.charAt(0);

    }

    /**
     * 生成指定长度汉字字符串
     */
    public static String getRandomChineseString(int length){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            stringBuilder.append(getRandomChar());
        }
        return stringBuilder.toString();

    }

    /**
     * 生成随机时间字符串
     */
    public static String getTimeString(String timeDateType,boolean isNow){
        Date date = new Date();
        String s = "";

        if (isNow){

        }else {
            Random random = new Random();
            //86400000L为一天
            //当前日期减去0～3650天
            long aLong = date.getTime() - (long) ((long)random.nextInt(3650)* 86400000L);
            date = new Date(aLong);
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(timeDateType);
        try{
            s = simpleDateFormat.format(date);
        }catch (Exception e){
            s = simpleDateFormat.format("yyyy-MM-dd");
            System.out.println("日期格式化错误");
        }
        return s;
    }

    /**
     * 生成随机数字
     */
    public static int getRandomInt(int min,int bound){
        Random random = new Random();
        int i = random.nextInt(bound)+min;
        return i;
    }

    /**
     * 生成随机字符串
     */
    public static String getRandomString(int length){
        Random random = new Random();
        StringBuilder s = new StringBuilder();
        for (int i=0 ; i <length ;i++ ){
            s.append((char) (65 + random.nextInt(26)));
        }
        return s.toString();
    }
}
