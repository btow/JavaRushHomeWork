package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        float minuts = Float.parseFloat(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println(getColor(minuts));

//        Map<Float, String> testsValue = new HashMap<>();
//        testsValue.put((float) 2.5, "зеленый");
//        testsValue.put((float) 3, "желтый");
//        testsValue.put((float) 4, "красный");
//        testsValue.put((float) 5, "зеленый");
//
//        for (Map.Entry entry :
//             testsValue.entrySet()) {
//            if (getColor((float)entry.getKey()).equals(entry.getValue())) {
//                String s = "The test is complied!";
//                System.out.println(s + ": " + entry.getValue());
//            } else {
//                String s = "The test isn't correctly!";
//                System.out.println(s + ": " + getColor((float)entry.getKey()) + " vs " + entry.getValue());
//            }
//        }
    }

    private static String getColor(float minuts) {

        String color = "красный";
        float multipleOfFive = minuts%5;

        if (Float.compare(multipleOfFive, 3) == -1) {
            color = "зеленый";
        } else if (Float.compare(multipleOfFive, 4) == -1) {
            color = "желтый";
        }

        return color;

    }
}