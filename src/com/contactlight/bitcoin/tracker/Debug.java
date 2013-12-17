package com.contactlight.bitcoin.tracker;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Debug {
    public static void log(String l){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("[" + sdf.format(cal.getTime()) + "] " + l);
    }
}
