package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        //Напишите тут ваш код

        map.put("Сталлоне",                 new Date("JUNE 1 1980"));
        map.put("Arnold Schwarzenegger",    new Date("JULY 30 1947"));
        map.put("Dolph Lundgren",           new Date("NOVEMBER 3 1957"));
        map.put("Jean-Claude Van Damme",    new Date("OCTOBER 18 1960"));
        map.put("Jason Statham",            new Date("SEPTEMBER 12 1967"));
        map.put("Bruce Lee",                new Date("NOVEMBER 27 1940"));
        map.put("Jackie Chan",              new Date("APRIL 7 1954"));
        map.put("Chuck Norris",             new Date("MARCH 10 1940"));
        map.put("Bruce Willis",             new Date("MARCH 19 1955"));
        map.put("Steven Seagal",            new Date("APRIL 10 1952"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            switch (iterator.next().getValue().getMonth())           // т.к. месяцы считаются с 0
            {
                case 5:
                case 6:
                case 7:
                    iterator.remove();
                    break;
            }
        }

        // или так
//        while (iterator.hasNext())
//        {
//            int month = iterator.next().getValue().getMonth() + 1;
//            if (6 <= month && month <= 8)
//            {
//                iterator.remove();
//            }
//        }
    }
}
