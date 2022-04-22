package ru.gb.leonidkoval.homework4;

import java.util.Random;

public class MineSweepper {
    //неизменяемые значения (константы - final, имя ЗАГЛАВНЫМИ БУКВАМИ):
    //тк объявили их в классе то их будет видно вовсех методах
    public static final int WIDTH = 10;            //ширина игр поля
    public static final int HEIGTH = 10;           //высота игр поля
    public static final int MINES_COUNT = 20;            // колво мин
    public static final int MINE = 1000;

    public static void main(String[] args) {

            play();  //if (WIDTH * HEIGTH <= MINES)


    }

    public static void play() {
        boolean win = true;
        int[][] board = generateBoard();            //создаёт игровое поле
        printBoard(board);                          //печать игрового поля
    }

    public static int[][] generateBoard() {
        int[][] board = new int[HEIGTH][WIDTH];     //массив игр поля из нолей по умолчанию
        Random random = new Random();
        int mines = MINES;                  // =20
        while(mines > 0){                  //20>0 да и проваливаемся в цикл
            int x, y;                      //ввели две переменные
            do{
                x = random.nextInt(HEIGTH); //не больше 10ти
                y = random.nextInt(WIDTH);  //не больше 10ти
            } while (board[x][y] == MINE);  // проверяем [x][y] = 1000? да ищем новые числа, нет переходим вниз
            board[x][y] == MINE;           // мину в ячейке [x][y] заполняем 1000ей
            mines--;                       // после выставления мины,mines=19 и продолжаем цикл. выход из цикла когда mines<0
        }
        return board;
    }

    public static void printBoard(int[][] board) {

    }
}
