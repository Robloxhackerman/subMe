package com.robloxhackerman.subme.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
    public Date stringToDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date newDate;

        try {
            newDate = dateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return newDate;
    }

    public String dateToString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String newDate;

        try {
            newDate = dateFormat.format(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return newDate;
    }
}
