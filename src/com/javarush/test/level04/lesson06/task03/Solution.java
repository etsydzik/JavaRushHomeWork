package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--)
        {
            System.out.println(array[i]);
        }
    }
}
