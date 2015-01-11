package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        Calendar calendar = Calendar.getInstance();

        String date = dateFormat.format(calendar.getTime());
        System.out.println(date);

//      System.out.println(new SimpleDateFormat("DD MM yyyy").format(Calendar.getInstance().getTime()));
    }
}
