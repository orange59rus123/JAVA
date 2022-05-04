package alishev_you_tube;

import java.util.Scanner;

public class JSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //вывели консоль
        System.out.println("Введи возраст цифрами");
        int age = scanner.nextInt(); //здесь сохраним введённое из консоли
        switch(age){
            case 0 : // если age = 0
                System.out.println("Ты родился");
                break;
            case 7 :  // если age = 7
                System.out.println("ты пошел в школу");
                break;
            case 18 :  // если age = 18
                System.out.println("Ты закончил школу");
                break;
                // default можно не писать тогда при несовпадении кейсов ничего не выполнится
            default:     //если не один case не равен age
                System.out.println("ни одно из условий не подошло");
        }



        Scanner scanner1 = new Scanner(System.in); //вывели консоль
        System.out.println("Введи возраст текстом");
        String age1 = scanner1.nextLine(); //здесь сохраним введённое из консоли
        switch(age1){
            case "ноль" : // если age = 0
                System.out.println("Ты родился");
                break;
            case "семь" :  // если age = 7
                System.out.println("ты пошел в школу");
                break;
            case "восемнадцать" :  // если age = 18
                System.out.println("Ты закончил школу");
                break;
            // default можно не писать тогда при несовпадении кейсов ничего не выполнится
            default:     //если не один case не равен age
                System.out.println("ни одно из условий не подошло");
        }
    }
}
