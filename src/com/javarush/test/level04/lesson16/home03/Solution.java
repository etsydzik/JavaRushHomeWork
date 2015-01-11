package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.InputStream;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        int sum = 0;
        int number = 0;
        do
        {
            number = scanner.nextInt();     // выполняется всегда цикл DO и проверяется условие while
            sum += number;                  // когда while не выполняется, то выйдет из цикла
        }                                   // и вополнятся всё после цикла
        while (number != -1);
        System.out.println(sum);

//        2-й варант
//        for(; number != -1;){
//            number = scanner.nextInt();
//            sum += number;
//        }
//        System.out.println(sum);

    }



}
