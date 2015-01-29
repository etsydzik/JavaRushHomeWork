package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by tsyd on 29.01.2015.
 */
public class Singleton
{
    private Singleton()
    {
    }

    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
