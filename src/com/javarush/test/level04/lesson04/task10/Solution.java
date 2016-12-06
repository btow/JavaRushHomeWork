package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrysInt = {Integer.parseInt(bufferedReader.readLine()),
                Integer.parseInt(bufferedReader.readLine()),
                Integer.parseInt(bufferedReader.readLine())};

        int[] outputValue = getEquals(arrysInt);

        for (int i :
                outputValue) {

            System.out.print(i + " ");

        }

        System.out.println();

    }

    private static int[] getEquals(int[] ints) {

        int[] outArray = new int[ints.length];
        int lengthReturnedArray = 0;

        for (int i = 0; i < ints.length; i++) {

            for (int j = i + 1; j < ints.length; j++) {

                if (ints[i] == ints[j]) {

                    if (outArray[i] == 0) {
                        outArray[i] = 1;
                        lengthReturnedArray++;
                    }

                    if (outArray[j] == 0) {
                        outArray[j] = 1;
                        lengthReturnedArray++;
                    }

                }

            }

        }

        int[] returnedArray = new int[lengthReturnedArray];
        int j = 0;

        for (int i = 0; i < ints.length; i++) {

            if (outArray[i] == 1) {

                returnedArray[j] = ints[i];
                j++;

            }

        }

        return returnedArray;
    }
}