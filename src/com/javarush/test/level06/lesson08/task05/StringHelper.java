package com.javarush.test.level06.lesson08.task05;

/* Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringHelper
{
    public static String multiply(String s) throws IOException
    {
        String result = "";
        //Напишите тут ваш код
        return (multiply(s,5));
    }

    public static String multiply(String s, int count)
    {
        String result = "";
        //Напишите тут ваш код
        for (int i = 0; i <  count; i++)
        {
            result += s;
        }

        return result;
    }
}
