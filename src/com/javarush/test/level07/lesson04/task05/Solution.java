package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int[]array = new int[20];
        int[]array2 = new int[10];
        int[]array3 = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array2.length; i++)
        {
            array2[i] = array[i];
        }

        for (int i = 0; i < array3.length; i++)
        {
            array3[i] = array[i + 10];
        }

        for (int i = 0; i < array3.length; i++)
        {
            System.out.println(array3[i]);
        }
    }
}
