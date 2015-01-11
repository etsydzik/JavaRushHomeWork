package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        int anInt1 = scanner.nextInt();
        int anInt2 = scanner.nextInt();
        int anInt3 = scanner.nextInt();
        int anInt4 = scanner.nextInt();
        System.out.println(
                (anInt1 > anInt2 && anInt1 > anInt3 && anInt1 > anInt4) ? anInt1 :
                (anInt2 > anInt3 && anInt2 > anInt4) ? anInt2 :
                        (anInt3 > anInt4) ? anInt3 :
                                anInt4);

    }
}
