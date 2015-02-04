package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by tsyd on 04.02.2015.
 */
public class Plane implements Flyable
{
    public int passangers;
    public Plane(int passangers)
    {
        this.passangers = passangers;
    }

    @Override
    public void fly()
    {

    }
}
