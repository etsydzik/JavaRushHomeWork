package com.javarush.test.level14.lesson08.home05;

/**
 * Created by tsyd on 29.01.2015.
 */
public class Keyboard implements CompItem
{
    @Override
    public String getName()
    {
        return this.getClass().getSimpleName();
    }
}
