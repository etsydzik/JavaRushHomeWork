package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws ParseException
    {
        //System.out.println(isDateOdd("January 2 2014"));
    }

    public static boolean isDateOdd(String date) throws ParseException
    {
       /*
         *перевести дату из стринг в дату
         *дату в лонг
         *создать текущую дату
         *перевести текущую дату в лонг
         *разница
         * */
        Date stringDate = new Date(date);
        long longstringDate = stringDate.getTime();
        Date currentDate = new Date();
        int thisYear = currentDate.getYear();
        Date firstDay = new Date(thisYear, 0, 1);
        long longFirstDay = firstDay.getTime();
        long daysBetween = (longstringDate - longFirstDay) / (24*60*60*1000);
        if (daysBetween % 2 != 0)
        {
            return true;
        } else
        {
            return false;
        }
    }
}
