package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Написать тут ваш код
        String s = new Scanner(System.in).nextLine();
        LinkedList<Character> vowels = new LinkedList<>();
        LinkedList<Character> consonants = new LinkedList<>();
        char[] array = s.toCharArray();
        for (char c : array)
        {
            if (isVowel(c)){
                vowels.add(c);
            } else if (c != ' '){
                consonants.add(c);
            }
        }
        for (Character vowel : vowels)
        {
            System.out.print(vowel + " ");
        }
        System.out.println();
        for (Character consonant : consonants)
        {
            System.out.print(consonant + " ");
        }

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
