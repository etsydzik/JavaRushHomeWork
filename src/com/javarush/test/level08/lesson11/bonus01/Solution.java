package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException, ParseException
    {
        //add your code here - напиши код тут
        String s = new Scanner(System.in).nextLine();
//        Date date = new Date(s + "1 1999");       // или так

        Date date = new SimpleDateFormat("MMM",Locale.UK ).parse(s);

        System.out.println(s + " is " + (date.getMonth() + 1) + " month");
    }

}
