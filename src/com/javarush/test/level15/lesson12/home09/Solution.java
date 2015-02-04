package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        int i = url.indexOf("?") + 1;
        String stringAfterQuestionMark = url.substring(i);

        String[] split = stringAfterQuestionMark.split("&");

        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> obj = new ArrayList<>();

        for (String s : split)
        {
            String[] key = s.split("=");
            strings.add(key[0]);
            if (key[0].equals("obj"))
            {
                obj.add(key[1]);
            }
        }

        for (String s : strings)
            System.out.print(s + " ");
        if (obj.size()!= 0)
        {
            System.out.println();
            for (String s : obj)
            {
                try
                {
                    Double doubleValue = Double.parseDouble(s);
                    alert(doubleValue);
                }
                catch (Exception e)
                {
                    alert(s);
                }
            }
        }
    }


    public static void alert(double value)
    {
        System.out.println("double " + value);
    }

    public static void alert(String value)
    {
        System.out.println("String " + value);
    }
}
