package alishev_you_tube;

import java.util.Scanner;

public class GInput {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("vvedi 4to nibud!");// введенное в консоль сохранится в - а.nextLine
        String b = a.nextLine(); // введенное присваиваем - b
        // nextLine вводим строку, string принимает строку
        System.out.println("ты ввёл " + b);

        Scanner c = new Scanner(System.in);
        System.out.println("vvedi цифру!");// введенное в консоль сохранится в - c.nextInt
        int d = c.nextInt(); // введенное присваиваем - d
        // nextInt вводим число, int d принимает число
        System.out.println("ты ввёл " + d);
    }
}
