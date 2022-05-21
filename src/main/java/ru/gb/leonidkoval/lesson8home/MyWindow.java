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

        final ActionListener btnListener = new ActionListener() { //для работы кнопки
            //при нажатии 5 нопки на остальных кнопках подпись "Нажал на кнопку 5"
            @Override
            public void actionPerformed(ActionEvent e) {
                final JButton button = (JButton) e.getSource();
                final String text = button.getText();
                final String btnNumber = text.substring(text.length() - 1);
                button1.setText("Нажал на кнопку " + btnNumber);
                button2.setText("Нажал на кнопку " + btnNumber);
                button3.setText("Нажал на кнопку " + btnNumber);
                button4.setText("Нажал на кнопку " + btnNumber);
                button5.setText("Нажал на кнопку " + btnNumber);
            }
        };
        button1.addActionListener(btnListener);//при нажатии на кнопку название кнопок меняется "Нажал на кнопку " + button
        button2.addActionListener(btnListener);
        button3.addActionListener(btnListener);
        button4.addActionListener(btnListener);
        button5.addActionListener(btnListener);

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
