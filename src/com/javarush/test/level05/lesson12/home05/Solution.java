package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        int sum = 0;
        while (!(string = bufferedReader.readLine()).equals("сумма"))
        {
            sum += Integer.parseInt(string);
        }
        System.out.println(sum);

//        InputStream in = System.in;
//        Scanner scanner = new Scanner(in);
//        String string;
//        int sum = 0;
//        while (!(string = scanner.nextLine()).equals("сумма")){
//            sum += = Integer.parseInt(string);
//        }
//        System.out.println(sum);
    }
}
