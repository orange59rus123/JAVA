package alishev_you_tube;

import java.util.Arrays;

public class MMultidimensionalArrays {
    public static void main(String[] args) {
        int[][] numbers = new int[5][2]; // 5 строк 2 столбца
        // чтобы обратиться к конкретной ячейке нужно задать номер строки и номер столба
        // нумерация с 0: 0,1,2,3...
        /*   0 1 2 3 4 5
        * 0  1 2
        * 1  3 4 2 3 7
        * 2  2 100
        * 3  3 3 2 2 2 5
        * 4  6 5
        *  к ячейке с 100 [2][1]*/

        int[][] matrice =  {{1, 2},
                            {3, 4, 2, 3, 7},
                            {2, 100},
                            {3, 3, 2, 2, 2, 5},
                            {6, 5}};
        System.out.println(Arrays.deepToString(matrice));  //печать всего массива
        System.out.println(matrice[2][1]); //печать ячейки
        System.out.println(matrice[3][5]); // 5
        System.out.println(matrice[2][1] + matrice[2][0]); //печать сложения 2х ячеек

        String[][] strings = new String[2][3];
        strings[0][0] = "hi";
        System.out.println(strings[0][0]);

        System.out.println("печать в виде таблицы");

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
