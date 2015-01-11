package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import javax.naming.Name;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
//        InputStream in = System.in;
//        Scanner scanner = new Scanner(in);
//        String name = scanner.nextLine();
//        int year = scanner.nextInt();
//        int month = scanner.nextInt();
//        int date = scanner.nextInt();
//        System.out.printf("Меня зовут %s%nЯ родился %s.%s.%s", name,date,month,year);
        InputStream in = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    }

}
