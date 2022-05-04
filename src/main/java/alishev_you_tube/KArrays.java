package alishev_you_tube;

import java.util.Arrays;

public class KArrays {
    public static void main(String[] args) {
        int number = 10;  //примитивны тип данных
        char character = 'a';  //примитивны тип данных
        String s = "Hello";  //ссылочный тип данных
        String s1 = new String("Hello"); //ссылочный тип данных

        int[] numbers = new int[5];  //ссылочный тип данных
       // numbers[0] = 1;
       // numbers[1] = 1;
       // numbers[2] = 1;
       // numbers[3] = 1;
       // numbers[4] = 2;
        //System.out.println(numbers[0]);

          // заполнение массива с помощью цикла фор
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i * 5;
            System.out.println(numbers[i]); // выводим элемент массива под индексом i
        }
        System.out.println(); //разделение текста пустой строкой
        //создание массива с инициализацией всех ячеек
        int[] numbers1 = {1, 2, 3};
        //печать всех элементов массива с помощью цикла фор
        for(int i = 0; i < numbers1.length; i++){
            System.out.println(numbers1[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers1));//печать всего массива
        System.out.println(Arrays.toString(numbers));

        System.out.println();

        int[][] numbers2 = new int[4][2]; //создание двумерного массива
        System.out.println(Arrays.deepToString(numbers2)); //печать всего двумерного массива
        System.out.println(numbers2[0][1]); // выводим элемент массива под индексом 0.1

        System.out.println("печать двумерного массива с помощью цикла");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(numbers2[i][j]);
            }
            System.out.println("далее");

        }



    }
}
