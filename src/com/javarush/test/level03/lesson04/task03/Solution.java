package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg00 = new Zerg();
        zerg00.name = "Zerg00";
        Zerg zerg01 = new Zerg();
        zerg01.name = "Zerg01";
        Zerg zerg02 = new Zerg();
        zerg02.name = "Zerg02";
        Zerg zerg03 = new Zerg();
        zerg03.name = "Zerg03";
        Zerg zerg04 = new Zerg();
        zerg04.name = "Zerg04";
        Zerg zerg05 = new Zerg();
        zerg05.name = "Zerg05";
        Zerg zerg06 = new Zerg();
        zerg06.name = "Zerg06";
        Zerg zerg07 = new Zerg();
        zerg07.name = "Zerg07";
        Zerg zerg08 = new Zerg();
        zerg08.name = "Zerg08";
        Zerg zerg09 = new Zerg();
        zerg09.name = "Zerg09";

        Protos protos00 = new Protos();
        protos00.name = "protos00";
        Protos protos01 = new Protos();
        protos01.name = "protos01";
        Protos protos02 = new Protos();
        protos02.name = "protos02";
        Protos protos03 = new Protos();
        protos03.name = "protos03";
        Protos protos04 = new Protos();
        protos04.name = "protos04";

        Terran terran00 = new Terran();
        terran00.name = "terran00";
        Terran terran01 = new Terran();
        terran01.name = "terran01";
        Terran terran02 = new Terran();
        terran02.name = "terran02";
        Terran terran03 = new Terran();
        terran03.name = "terran03";
        Terran terran04 = new Terran();
        terran04.name = "terran04";
        Terran terran05 = new Terran();
        terran05.name = "terran05";
        Terran terran06 = new Terran();
        terran06.name = "terran06";
        Terran terran07 = new Terran();
        terran07.name = "terran07";
        Terran terran08 = new Terran();
        terran08.name = "terran08";
        Terran terran09 = new Terran();
        terran09.name = "terran09";
        Terran terran10 = new Terran();
        terran10.name = "terran10";
        Terran terran11 = new Terran();
        terran11.name = "terran11";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}