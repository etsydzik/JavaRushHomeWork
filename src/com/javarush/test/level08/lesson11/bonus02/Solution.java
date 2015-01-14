package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //  было
        //list of addresses
//        List<String> addresses = new ArrayList<String>();
//        while (true)
//        {
//            String family = reader.readLine();
//            if (family.isEmpty()) break;
//
//            addresses.add(family);
//        }
//
//        //read home number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < addresses.size())
//        {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }

        HashMap<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
//            System.out.println("Напишите адрес");
            String address = scanner.nextLine();
            if (!address.isEmpty()){
//                System.out.println("Напишите фамилию");
                String family = scanner.nextLine();
                if (!family.isEmpty()){
                    map.put(address, family);
                } else break;
            }else break;
        }

//        System.out.println("Напишите проверочный адрес");
        String address2 = scanner.nextLine();
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (address2.equals(pair.getKey())){
                System.out.println(pair.getValue());
            }
        }
    }
}
