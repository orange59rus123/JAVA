package ru.gb.leonidkoval;

import java.util.Arrays;

public class hw3 {
        public static void main(String[] args) {
            //change0To1();
            //massiv100();
            //lessThan6();
            diagonal();
            //lenInitialValue(2, 9);
            //maxMin();
        }

        public static void change0To1() {
            int[] change = {1, 0, 1, 0, 1, 1};//��
            System.out.println(Arrays.toString(change));
            for (int i = 0; i < change.length; i++) {
                if (change[i] == 0) {
                    change[i] = 1;
                } else {
                    change[i] = 0;
                }
            }
            System.out.println(Arrays.toString(change));//�����
        }

        public static void massiv100() {
            int[] mass = new int[100];
            //System.out.print(Arrays.toString(mass));
            for (int i = 0; i < mass.length; i++) {
                mass[i] = i + 1;
                System.out.printf("mass[%d]= %d; ", i, mass[i]);
                System.out.println();
            }
        }

        public static void lessThan6() {
            int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};//��
            System.out.print(Arrays.toString(mass));
            System.out.println();
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] < 6) {
                    mass[i] = mass[i] * 2;
                } else {
                    mass[i] = mass[i];
                }
            }
            System.out.println(Arrays.toString(mass));//����� �����
        }

        public static void diagonal() {
            int[][] diag = new int[10][10];
           for (int i = 0; i < diag.length; i++) {
               diag[i][i] = 1;
               diag[i][diag.length - i - 1] = 1;
           }
            System.out.print(Arrays.deepToString(diag));
        }


    public static void lenInitialValue(int len, int iniyialValue) {
        int[] leni = new int[len];
        //System.out.println(Arrays.toString(leni)); ��������
        for (int i = 0; i < leni.length; i++) {
            leni[i] = iniyialValue;
        }
        System.out.println(Arrays.toString(leni));


    }


    public static void maxMin() {
        int[] maxMin = {8, 2, 5, 56, 6, -8};
        System.out.println("search max and min number is of this array: " + Arrays.toString(maxMin));

        for (int i = 0; i < maxMin.length; i++) {

            int max = maxMin[0];
            if (max < maxMin[0 + i]) {
                System.out.println(maxMin[i] + " - max number!");
            }


        }
        for (int i = 0; i < maxMin.length; i++) {
            int min = maxMin[1];
            if (min > maxMin[0 + i]) {
                System.out.println(maxMin[i] + " - min number!");
            }
        }
    }
}
//   моё до разбора дз public static void diagonal
//            for (int k = 0; k < diag[i].length; k++)
//                if (i == k) {
//                    System.out.print(" 1 ");
//                } else if (i == 0 && k == 4) {
//                    System.out.print(" 1 ");
//                } else if (i == 1 && k == 3) {
//                    System.out.print(" 1 ");
//                } else if (i == 3 && k == 1) {
//                    System.out.print(" 1 ");
//                } else if (i == 4 && k == 0) {
//                    System.out.print(" 1 ");
//                } else {
//                    System.out.print(" 0 ");



