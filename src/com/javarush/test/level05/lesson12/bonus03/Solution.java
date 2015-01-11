package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int maximum = 0;
//
//
//        //напишите здесь ваш код
//        int N = Integer.parseInt(reader.readLine());
//        int[] array = new int[N];
//        for (int i = 0; i <N ; i++)
//        {
//            array[i] = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
//        }
//        Arrays.sort(array);
//        maximum = array[array.length - 1];
//
//
//        System.out.println(maximum);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < N; i++)
        {
            int num = Integer.parseInt(reader.readLine());
            arr.add(num);
        }
        Collections.sort(arr);
        int maximum = arr.get(N - 1);

        System.out.println(maximum);
    }
}
