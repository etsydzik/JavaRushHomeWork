package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Досин", "Женя");
        map.put("Лобко", "Артём");
        map.put("Цыдзик", "Женя");
        map.put("Цыдзика", "Дима");
        map.put("Валентинович", "Артём");
        map.put("Семеняко", "Артём");
        map.put("Рабцевич", "Дима");
        map.put("Будько", "Лёша");
        map.put("Пашковский", "Лёня");
        map.put("Березовский", "Паша");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
        HashSet<String> names = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();
        for (String s : map.values())
        {
            if (names.contains(s)){
                duplicates.add(s);
            } else {
                names.add(s);
            }
        }
        for (String duplicate : duplicates)
        {
            removeItemFromMapByValue(map, duplicate);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }



}
