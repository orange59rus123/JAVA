package ru.gb.leonidkoval.lesson8;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//
        setBounds(450, 200, 400, 400);//гранцы окна лев верх угол, ширина, высота
        setVisible(true); //чтобы окно появилось
    }

    public static void main(String[] args) {
        new MyWindow(); //вызов окна
    }
}


