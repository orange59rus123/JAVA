package alishev_you_tube;

public class LArraysOfString {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String[] strings = new String[5]; //создание текстового массива из строк
        strings[0] = "hello";
        strings[1] = "Leo";
        strings[2] = "Java";
        System.out.println(strings[0]);
        System.out.println(strings[1]);

        System.out.println("печать текстового массива с помощью цикла");

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println("печать текстового массива с помощью цикла фор ич");
        for (String a:strings){
            System.out.println(a);
        }

        //находим сумму всех чисел массива c помощью фор

        int[] numbers1 = {2, 2, 2};
        int summ = 0;
        for (int i = 0; i < numbers1.length; i++) {
            summ = summ + numbers1[i];
            System.out.println("summ пока равно " + summ);

        }
        System.out.println("summ ОКОНЧАТЕЛЬНО равно " + summ);

        //находим сумму всех чисел массива c помощью фор ич

        int[] numbers2 = {2, 2, 2};
        int summ2 = 0;
        for(int x:numbers2){
            summ2 = summ2 + x;
            System.out.println("summ2 пока равно " + summ2);
        }
        System.out.println("summ2 ОКОНЧАТЕЛЬНО равно " + summ2);

    }
}
