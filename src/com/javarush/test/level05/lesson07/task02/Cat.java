package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //Напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String adress;
    private String collor;

    public void initialize(String name){
        this.name = name;
        this.age = 2;
        this.weight = 3;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
    }

    public void initialize(int weight, String collor){
        this.weight = weight;
        this.collor = collor;
        this.age = 2;
    }

    public void initialize(int weight, String collor, String adress){
        this.weight = weight;
        this.collor = collor;
        this.adress = adress;
        this.age = 2;
    }

}
