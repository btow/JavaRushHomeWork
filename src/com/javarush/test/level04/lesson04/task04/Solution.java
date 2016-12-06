package com.javarush.test.level04.lesson04.task04;

/* Время года
Реализовать метод checkSeason. По номеру месяца, метод должен определить
время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/

public class Solution
{
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int mount){
        //::CODE:
        String season = "зима";

        if (2 < mount & mount < 6) {
            season = "весна";
        } else if (5 < mount & mount < 9) {
            season = "лето";
        } else if (8 < mount & mount < 12) {
            season = "осень";
        }

        System.out.println(season);

    }
}