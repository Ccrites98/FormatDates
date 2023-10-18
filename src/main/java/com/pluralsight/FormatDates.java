package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class FormatDates {
    public static void main(String[] args) {
        ZonedDateTime gmtDateTime = ZonedDateTime.now(ZoneId.of("GMT"));
        // Jamie, pull up that romantic date right now man
        DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = gmtDateTime.format(dateFormat1);
        DateTimeFormatter dateFormat2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = gmtDateTime.format(dateFormat2);
        DateTimeFormatter dateFormat3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate3 = gmtDateTime.format(dateFormat3);
        DateTimeFormatter dateFormat4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
        String formattedDate4 = gmtDateTime.format(dateFormat4);
        DateTimeFormatter timeFormat5 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = gmtDateTime.format(timeFormat5);
//Now print that up jamie
        System.out.println(formattedDate1);
        System.out.println(formattedDate2);
        System.out.println(formattedDate3);
        System.out.println(formattedDate4);
        System.out.println(formattedTime);
    }

    }

