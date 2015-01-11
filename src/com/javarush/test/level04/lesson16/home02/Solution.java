package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        int [] array = new int[3];
            for (int i = 0; i < 3; i++)
            {
             array[i] = scanner.nextInt();
            }
        Arrays.sort(array);
        System.out.println(array[1]);
    }
}
