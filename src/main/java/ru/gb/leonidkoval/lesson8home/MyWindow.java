package ru.gb.leonidkoval.lesson8home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {  // с помощью extends JFrame импорт swing
    public MyWindow() {
        setTitle("test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// при закрытии окошка программа завершается
        setBounds(450, 200, 400, 400);//гранцы окна лев верх угол, ширина, высота

        final JButton[] jButtons = new JButton[5];

        jButtons[0] = new JButton("Button #1");  //кнопки с названием Button #,,
        jButtons[1] = new JButton("Button #1");  //кнопки с названием Button #,,
        jButtons[2] = new JButton("Button #2");  //кнопки
        jButtons[3] = new JButton("Button #3");  //кнопки
        jButtons[4] = new JButton("Button #4");  //кнопки


        add(jButtons[0], BorderLayout.NORTH); //вызов кнопки с расположением BorderLayout
        add(jButtons[1], BorderLayout.SOUTH);
        add(jButtons[2], BorderLayout.WEST);
        add(jButtons[3], BorderLayout.EAST);
        add(jButtons[4], BorderLayout.CENTER);

        final ActionListener btnListener = new ActionListener() { //для работы кнопки
            //при нажатии 5 нопки на остальных кнопках подпись "Нажал на кнопку 5"
            @Override
            public void actionPerformed(ActionEvent e) {
                final JButton button = (JButton) e.getSource();
                final String text = button.getText();
                final String btnNumber = text.substring(text.length() - 1);

            }
        };
        for (JButton jButton : jButtons) { //циклом определяем нажатие кнопок
            jButton.addActionListener(btnListener);
        }


        setVisible(true); //чтобы окно появилось
    }

    public static void main(String[] args) {
        new MyWindow(); //вызов окна
    }
}

class Button5Listener implements ActionListener {  //implement method
    // тут будет происходить код при нажатии на кнопку Button5
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
