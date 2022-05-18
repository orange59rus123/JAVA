package ru.gb.leonidkoval.lesson8;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {  // с помощью extends JFrame импорт swing
    public MyWindow() {
        setTitle("test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// при закрытии окошка программа завершается
        setBounds(450, 200, 400, 400);//гранцы окна лев верх угол, ширина, высота
        final JButton button1 = new JButton("Button #1");  //кнопки с названием Button #,,
        final JButton button2 = new JButton("Button #2");  //кнопки
        final JButton button3 = new JButton("Button #3");  //кнопки
        final JButton button4 = new JButton("Button #4");  //кнопки
        final JButton button5 = new JButton("Button #5");  //кнопки
        add(button1, BorderLayout.NORTH); //вызов кнопки с расположением BorderLayout
        add(button2, BorderLayout.SOUTH);
        add(button3, BorderLayout.WEST);
        add(button4, BorderLayout.EAST);
        add(button5, BorderLayout.CENTER);
        setVisible(true); //чтобы окно появилось
    }

    public static void main(String[] args) {
        new MyWindow(); //вызов окна
    }
}


