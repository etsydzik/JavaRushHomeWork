package com.javarush.test.level14.lesson06.home01;

/**
 * Created by tsyd on 28.01.2015.
 */
public class RussianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 40;
    }


    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
