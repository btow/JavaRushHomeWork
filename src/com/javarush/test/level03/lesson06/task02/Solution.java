package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        int multiply = 0;

        for (int a = 1; a < 11; a++) {
            for (int b = 1; b < 11; b++) {
                multiply = a * b;
                if (b < 10) {
                    System.out.print(multiply + " ");
                } else {
                    System.out.print(multiply + "\n");
                }
            }
        }

    }
}