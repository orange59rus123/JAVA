package alishev_you_tube;

import java.util.Scanner;

public class HDoWhileLoop {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("введи 5ку!");
        int b = a.nextInt();// что ввели будет хранится в - а
        while(b!=5) { // если тру то выполняется внутри цикла действие и возвращает обратно на условие вайл
                      // если фолс то пропускаем цикл
            System.out.println("это цифра между 4мя и 6ю!! введи 5ку!!");
            b = a.nextInt(); // вводим сканер и выходим опять на условие цикла
        }
        System.out.println("ты ввёл 5!");


        Scanner c = new Scanner(System.in);
        int d;
        do {  //сначала выполняет потом проверяет
            System.out.println("введи 7ку!");
            d = c.nextInt();

        } while(d!=7); //возвращает на do если false
        System.out.println("ты ввёл 7!");


    }
}
