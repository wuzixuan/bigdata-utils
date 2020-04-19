package com.wuzixuan.makelogfile.action;

import com.wuzixuan.makelogfile.utils.MakeData;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(MakeData.getTimeString("yyyy-MM-dd",false));
        }
    }
}
