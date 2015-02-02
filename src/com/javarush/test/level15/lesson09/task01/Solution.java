package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution
{
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(2.0, "a");
        labels.put(15.0d, "b");
        labels.put(111.23, "c");
        labels.put(0.1, "d");
        labels.put(4975324.324659678, "e");
    }

    public static void main(String[] args)
    {
        System.out.println(labels);
    }
}
