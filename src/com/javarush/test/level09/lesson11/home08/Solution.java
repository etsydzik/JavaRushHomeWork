package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //Написать тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2};
        int[] array3 = {1,2,3,4};
        int[] array4 = {1,2,3,4,5,6,7};
        int[] array5 = {};
        Collections.addAll(list, array1, array2, array3, array4, array5);

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array : list)
        {
            for (int x : array)
            {
                System.out.println(x);
            }
        }
    }
}
