package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код

        Human son1 = new Human("Дима", true, 25);
        Human son2 = new Human("Женя", true, 24);
        Human son3 = new Human("Кто-то", true, 0);
        Human mother = new Human("Люда", false, 45, son1, son2, son3);
        Human father = new Human("Валик", true, 45, son1, son2, son3);
        Human grandMother1 = new Human("Стася", false, 70, father);
        Human grandMother2 = new Human("Нина", false, 60, mother);
        Human ded1 = new Human("Метак", true, 70, father);
        Human ded2 = new Human("Володя", true, 60, mother);

        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(ded1);
        System.out.println(ded2);
    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        List<Human> children;

        public Human(String name, boolean sex, int age, Human... children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = Arrays.asList(children);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
