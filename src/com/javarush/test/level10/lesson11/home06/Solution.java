package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        String surname;
        String address;
        int age;
        int weight;
        int growth;

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, String surname)
        {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, String address)
        {
            this.name = name;
            this.surname = surname;
            this.address = address;
        }

        public Human(String name, String surname, String address, int age)
        {
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.age = age;
        }

        public Human(String name, String surname, String address, int age, int weight)
        {
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, String surname, String address, int age, int weight, int growth)
        {
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.age = age;
            this.weight = weight;
            this.growth = growth;
        }

        public Human(String name, String address, int age)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public Human(String name, int weight, String address)
        {
            this.name = name;
            this.weight = weight;
            this.address = address;
        }

        public Human(String name, int growth)
        {
            this.name = name;
            this.growth = growth;
        }

        public Human(String name, int growth, int weight)
        {
            this.name = name;
            this.growth = growth;
            this.weight = weight;
        }
    }
}
