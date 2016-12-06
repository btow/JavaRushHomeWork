package com.javarush.test.level04.lesson04.task03;

/* Интервал
Реализовать метод checkInterval. Метод должен проверять попало ли целое число в интервал от 50 до 100
и сообщить результат на экран в следующем виде: "Число а не содержится в интервале." или "Число а содержится в интервале.",
где  а - аргумент метода.
Пример для числа 112:
Число 112 не содержится в интервале.
Пример для числа 60:
Число 60 содержится в интервале.
*/

import static java.lang.String.valueOf;

public class Solution
{
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
    }

    public static void checkInterval(int a){
        //::CODE:
        int min = 50, max = 100;
        String s = "Число ";
        if (min < a & a < max) {
            s += valueOf(a);
        } else {
            s += valueOf(a);
            s += " не";
        }
        s += " содержится в интервале.";

        System.out.println(s);
    }
}