package com.javarush.test.level14.lesson06.home01;

/**
 * Created by tsyd on 28.01.2015.
 */
public abstract class Hen
{
    abstract int getCountOfEggsPerMonth();

    String getDescription(){
        return "Я курица.";
    }
}
