package com.javarush.test.level14.lesson08.bonus01;

import com.sun.javaws.exceptions.ExitException;


import java.io.IOException;
import java.util.*;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        exceptions.add(new NullPointerException());
        exceptions.add(new IOException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new RuntimeException());
        exceptions.add(new ConcurrentModificationException());
        exceptions.add(new EmptyStackException());
        exceptions.add(new FormatterClosedException());
        exceptions.add(new InputMismatchException());
    }
}
