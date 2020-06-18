package com.odazie.learning.firstspringapp.web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/// In Your next project you should is use LocalDate or LocalDateTime class because date is deprecated

public class DateUtils {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyy-MM-d");

    public static Date createDateFromDateString(String dateString){
        Date date = null;
        if (null != dateString){
            try {
                date = (DATE_FORMAT).parse(dateString);

            }catch (ParseException pe){
                date = new Date();

            }
        }else {
            date = new Date();
        }

        return date;
    }
}
