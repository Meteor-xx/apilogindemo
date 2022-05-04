package com.webdemo.weapi.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static Date addS(Date s, int n) {
        try {

            Calendar cd = Calendar.getInstance();
            cd.setTime(s);
            cd.add(Calendar.SECOND, n);

            return cd.getTime();
        } catch (Exception e) {
            return null;
        }
    }

    /***
     * 减N秒
     *
     * @param s
     * @param n
     * @return
     */
    public static Date reductionS(Date s,int n){
        try {
            Calendar cd = Calendar.getInstance();
            cd.setTime(s);
            cd.set(Calendar.SECOND,cd.get(Calendar.SECOND) - n);
            return cd.getTime();
        }catch (Exception e){
            return null;
        }
    }
}
