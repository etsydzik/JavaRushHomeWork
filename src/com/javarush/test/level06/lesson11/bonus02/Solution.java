package com.javarush.test.level06.lesson11.bonus02;

import java.io.*;
import java.util.Scanner;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader = new BufferedReader(new StringReader("дедушка Вася\n" +
//                "бабушка Мурка\n" +
//                "папа Котофей\n" +
//                "мама Василиса\n" +
//                "сын Мурчик\n" +
//                "дочь Пушинка"));

        String grandFather = reader.readLine();
        Cat catGrandFather = new Cat(grandFather);

        String grandMother = reader.readLine();
        Cat catGrandMother = new Cat(grandMother);

        String father = reader.readLine();
        Cat catFather = new Cat(father, catGrandFather, null);

        String mother = reader.readLine();
        Cat catMother = new Cat(mother, null, catGrandMother);

        String son = reader.readLine();
        Cat catSon = new Cat(son, catFather, catMother);

        String daughter = reader.readLine();
        Cat catDaughter = new Cat(daughter, catMother, catFather);


        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name)
        {
            this.name = name;
        }

        public Cat(String name, Cat father, Cat mother)
        {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }


        @Override
        public String toString()
        {
            return String.format("Cat name is %s, %s, %s", name,
                    (mother == null) ? "no mother" : "mother is " + mother.name,
                    (father == null) ? "no father" : "father is " + father.name);
        }
    }

}
