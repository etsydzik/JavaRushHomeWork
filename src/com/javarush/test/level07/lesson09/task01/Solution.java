package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка  с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++)
        {
            list.add(scanner.nextInt());
        }
        ArrayList<Integer> newList1 = new ArrayList<>();
        ArrayList<Integer> newList2 = new ArrayList<>();
        ArrayList<Integer> newList3 = new ArrayList<>();
        for (Integer a : list)
        {
            if (a % 3 == 0)
            {
                newList1.add(a);
            }
            if (a % 2 == 0)
            {
                newList2.add(a);
            }
            if (a % 3 != 0 && a % 2 != 0)
            {
                newList3.add(a);
            }
        }
        printList(newList1);
        printList(newList2);
        printList(newList3);

    }

    public static void printList(List<Integer> list)
    {
        //add your code here
        for (Integer integer : list)
        {
            System.out.println(integer);
        }

    }
}
