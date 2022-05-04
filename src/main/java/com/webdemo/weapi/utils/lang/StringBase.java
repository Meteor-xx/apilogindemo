package com.webdemo.weapi.utils.lang;

public class StringBase {
    public static boolean checkStr(String str) {
        if (null != str) {
            if (!"".equals(str.trim()) && !"null".equals(str.trim())) {
                return true;
            }
        }
        return false;
    }
}
