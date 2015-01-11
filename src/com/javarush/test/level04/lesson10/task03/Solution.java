package com.javarush.test.level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        String string = scanner.nextLine();
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n){
            System.out.println(string);
            i++;
        }

    }
}
