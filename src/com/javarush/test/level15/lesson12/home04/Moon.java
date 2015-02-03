package com.javarush.test.level15.lesson12.home04;

/**
 * Created by tsyd on 03.02.2015.
 */
public class Moon implements Planet
{
    private Moon()
    {
    }

    private static Moon instance;

    public static Moon getInstance(){
        if (instance == null){
            instance = new Moon();
        }
        return instance;
    }
}
