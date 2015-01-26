package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        Scanner file = new Scanner(inputStream);

        while ( file.hasNextLine()){
            System.out.println(file.nextLine());
        }

        file.close();
        inputStream.close();
    }
}
