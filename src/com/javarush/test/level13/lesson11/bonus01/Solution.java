package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);        //поток
        Scanner fileScanner = new Scanner(fileInputStream);                     //обёртка
        List<Integer> list = new LinkedList<>();
        while (fileScanner.hasNextInt())
        {
            int element;
            element = fileScanner.nextInt();                                    //считывание цифры
            if (element % 2 == 0){
                list.add(element);
            }
        }
        Collections.sort(list);
        for (Integer integer : list)
        {
            System.out.println(integer);
        }
    }
}
