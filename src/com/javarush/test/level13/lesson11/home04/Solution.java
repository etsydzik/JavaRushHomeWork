package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        String s;
        FileOutputStream out = new FileOutputStream(fileName);
        PrintWriter printWriter = new PrintWriter(out);

        do
        {
            s = scanner.nextLine();
            printWriter.println(s);
        }
        while (!(s).equals("exit"));


        printWriter.close();
        out.close();
    }
}
