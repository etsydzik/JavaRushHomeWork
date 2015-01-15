package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //Напишите тут ваш код
        LinkedList<String> listString = new LinkedList<>();
        LinkedList<Integer> listInteger = new LinkedList<>();
        for (String s : array)
        {
            if (isNumber(s)){
                listInteger.add(Integer.parseInt(s));
            } else {
                listString.add(s);
            }
        }

        Collections.sort(listInteger, new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o2 - o1;
            }
        });
        Collections.sort(listString, new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                return isGreaterThen(o1, o2) ? 1 : -1;
            }
        });
        String[] newArray = new String[array.length];
        int i = 0;
        Iterator<Integer> iteratorInteger = listInteger.iterator();
        Iterator<String> iteratorString = listString.iterator();
        for (String s : array)
        {
            if (isNumber(s)){
                newArray[i] = iteratorInteger.next().toString();
                i++;
            }else {
                newArray[i] = iteratorString.next();
                i++;
            }
        }
        for (int j = 0; j < newArray.length; j++)
        {
            array[j] = newArray[j];
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
