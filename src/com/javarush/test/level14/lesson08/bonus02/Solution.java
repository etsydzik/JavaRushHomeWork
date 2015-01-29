package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        nod(a,b);
    }

    static void nod(int a, int b)
    {
        int x = Math.min(a, b);
        int y = Math.max(a, b);
        int result;
        if (y % x == 0){
            System.out.println(x);
        }else{
            nod(y % x, x);
        }
    }
}
