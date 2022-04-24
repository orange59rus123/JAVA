package ru.gb.leonidkoval.homework4;

import java.util.Random;
import java.util.Scanner;

public class MineSweepper {
    //неизменяемые значения (константы - final, имя ЗАГЛАВНЫМИ БУКВАМИ):
    //тк объявили их в классе то их будет видно вовсех методах
    public static final int WIDTH = 15;            //ширина игр поля
    public static final int HEIGTH = 10;           //высота игр поля
    public static final int MINES_COUNT = 20;            // колво мин

    public static final int MINE = 1000;
    public static final int EMPTY = 0;
    public static final int CELL_OPEN = 1;
    public static final int CELL_CLOSE = 0;
    public static final int CELL_FLAG = -1;


    public static final String ANSI_RESET = "\u001b[0m";
    public static final String ANSI_RED = "\u001b[31m";
    public static final String ANSI_GREEN = "\u001b[32m";
    public static final String ANSI_YELOW = "\u001b[33m";
    public static final String ANSI_BLUE = "\u001b[34m";
    public static final String ANSI_PURPLE = "\u001b[35m";
    public static final String ANSI_CYAN = "\u001b[36m";
    public static final String ANSI_WHITE = "\u001b[37m";



    public static void main(String[] args) {
        if ((WIDTH * HEIGTH) <= MINES_COUNT) {
            System.out.println("НЕОБХОДИМО УМЕНЬШИТЬ ЧИСЛО МИН!");
        } else{
            play();
        }
    }

    public static void play() {
        boolean win = true;
        int[][] board = generateBoard();            //создаёт игровое поле
        int[][] moves = new int [HEIGTH][WIDTH];
        boolean isPassMove = move(board, moves);    // если  не взорвался true
        //printBoard(board, moves);                          //печать игрового поля
    }

    private static boolean move(int[][] board, int[][] moves) {
        Scanner scanner = new Scanner(System.in);
        printBoard(board, moves);
        int row, line;  //столбец и строка
        while(true) {
            System.out.print("ВАШ ХОД (СТРОКА, СТОЛБЕЦ, например 1А): ");
            String move = scanner.nextLine();
            char firstSym = move.charAt(0);
            char secondSym = move.charAt(1);
        }
        return false;
    }

    public static int[][] generateBoard() {
        int[][] board = new int[HEIGTH][WIDTH];     //массив игр.поля из нолей по умолчанию с размерами [][]
        Random random = new Random();
        int mines = MINES_COUNT;                  // =20
        while (mines > 0) {                  //20>0 да и проваливаемся в цикл
            int x, y;                      //ввели две переменные
            do{
                x = random.nextInt(HEIGTH); //не больше 10ти
                y = random.nextInt(WIDTH);  //не больше 10ти
            } while (board[x][y] == MINE);  // проверяем [x][y] = 1000? да ищем новые числа, нет переходим вниз
            board[x][y] = MINE;           // мину в ячейке [x][y] заполняем 1000ей
            mines--;                       // после выставления мины,mines=19 и продолжаем цикл. выход из цикла когда mines<0
        }
        for (int i = 0; i < HEIGTH; i++) {   // по строкам
            for (int j = 0; j < WIDTH; j++) { // по столбцам
                if (board[i][j] == MINE) {
                    continue;              // не даёт перейти на следующую операцию если == MINE
                }
                int mCount = 0;                      // если не равно MINE
                for (int k = i - 1; k <= i +1; k++) {        // в этом цикле просматриваем вокруг
                    for (int l = j - 1; l <= j + 1; l++) {   //  ячейки есть ли мины
                        if (k < 0 || k >= HEIGTH || l < 0 || l >= WIDTH) { // если заходим за пределы массива
                            continue;                                     // то идем вверх не давая там искать
                        }
                        if (board[k][l] == MINE) { // если нашли мину в заданном секторе поиска
                            mCount++;              //то переходим сюда и увеличиваем число mCount т.е. число мин
                        }

                    }

                }
                board[i][j] = mCount;  // обозначили скко мин вокруг этой ячейки

            }
        }
        return board;
        }

    public static void printBoard(int[][] board, int[][] moves) { // печать игровой доски в методе
        System.out.println();
        System.out.println("  SUPER MEGA DANGER GAME ");
        System.out.println("      \u001b[31m*S*A*P*P*E*R*\u001b[0m"); //сделал красным и отменил красный цвет текста после его вывода
        System.out.println("    !!DON'T EXPLODE!!");
        System.out.println();
        System.out.print("  /");
        for (char i = 'A'; i < 'A' + WIDTH; i++) { //печать букв по порядку АВС.. с помощью char
            System.out.print(" " + i);           // чз пробел
        }
        System.out.println();
        for (int i = 0; i < HEIGTH; i++) {
            System.out.printf("%3d", i);
            for (int j = 0; j < WIDTH; j++) {
                if (moves[i][j] == CELL_CLOSE) {          //проверяем пустая ли ячейка
                    System.out.print("[]");
                    continue;
                }
                if (moves[i][j] == CELL_FLAG){
                    System.out.print(" P");  //флажок
                    continue;
                }
                final String colorCode = getColorCode(board[i][j]);
                System.out.print(colorCode);
                if (board[i][j] == EMPTY) {
                    System.out.print(" .");   // если ноль то печатаем тчк
                } else if (board[i][j] == MINE) {
                    System.out.print(" *");    // если мина(1000) то *
                } else {
                    System.out.printf("%2d", board[i][j]); // если там цифра то напечатаем её используя 2места в строке тк %2d
                }
                System.out.print(ANSI_RESET); //сброс цвета
            }
            System.out.println();

        }

    }

    public static String getColorCode(int i) {
    switch (i) {
        case EMPTY:
            return ANSI_WHITE;
        case MINE:
            return ANSI_PURPLE;
        case 1:
            return ANSI_BLUE;
        case 2:
            return ANSI_GREEN;
        case 3:
            return ANSI_RED;
        case 4:
            return ANSI_CYAN;
        default:               //если 5,6,7,8
            return ANSI_YELOW;
    }

    }

}
