package com.duan.cn.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String format(Date date,String format){
        date=new Date(System.currentTimeMillis());
        String str=new SimpleDateFormat(format).format(date.getTime());
        return str;
    }
}
