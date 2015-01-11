package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код
    private String friends;

    public void initialize(String name){
        this.friends = name;
    }
    public void initialize(String name, int age){
        this.friends = name + age;
    }

    public void initialize(String name, int age, String sex){
        this.friends = name + age + sex;
    }

}
