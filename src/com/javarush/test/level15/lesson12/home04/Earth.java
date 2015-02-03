package com.javarush.test.level15.lesson12.home04;

/**
 * Created by tsyd on 03.02.2015.
 */
public class Earth implements Planet
{
    private Earth()
    {
    }

    private static Earth instance;

    public static Earth getInstance(){
        if (instance == null){
            instance = new Earth();
        }
        return instance;
    }
}
