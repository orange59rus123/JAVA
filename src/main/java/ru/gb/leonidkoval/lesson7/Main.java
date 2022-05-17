package ru.gb.leonidkoval.lesson7;



public class Main {
    //обёртки над примитивными типами
    public static void main(String[] args) {
        //примитивные типы
        byte by;  // !=null
        short s;
        char c;
        long lng;
        float f;
        double d;
        boolean bln;

        int a = 1000;
        int b = 1000;
        System.out.println(a == b);
        /*
        if (a==b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }*/

        //классы обертки
        Byte bt;
        Short srt;
        Character ch;

        Integer in = new Integer(10);
        in += 10;


        Long l;
        Float flt;
        Double dbl;
        Boolean bln1;

        Integer x = 1000; //-128 - +127 в этом диапазоне равные ссылки тк кэш в этом диапазоне
        Integer z = 1000;
        System.out.println(x == z);  //сравнение ссылок на объект, а не чисел

        Integer v = 1000;
        Integer n = 1000;
        System.out.println(v.equals(n));

         String t = new String("abc");//ccылка
         String m = new String("abc");

        System.out.println(t == m);

        String r ="abc";//string pool
        String y = "abc";

        System.out.println(r == y);

// для действительного сравнения данных equals
        String g = new String("abc");//ccылка
        String h = new String("abc");
                  //сравнениe
        System.out.println(g.equals(h));  //true




    }
}
