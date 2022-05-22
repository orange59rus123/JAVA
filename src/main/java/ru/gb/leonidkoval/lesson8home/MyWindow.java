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

        final JButton[] jButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            jButtons[i] = new JButton("Button #" + (i + 1));
        }

        final JLabel text = new JLabel("Text");
        // JTextField // однострочное текстовое поле
        // JTextArea // многострочное текстовое поле
        // JRadioButton
        // JCheckBox
        final LayoutManager boxLayout = new GridLayout(3, 4); //GridLayout размещение кнопок с определением колва по осям

        setLayout(boxLayout);


        final ActionListener btnListener = new ActionListener() { //для работы кнопки
            //при нажатии 5 нопки на остальных кнопках подпись "Нажал на кнопку 5"
            @Override
            public void actionPerformed(ActionEvent e) {
                final JButton button = (JButton) e.getSource();
                final String text = button.getText();
                final String btnNumber = text.substring(text.length() - 1);
                System.out.println("нажата кнопка " + btnNumber); //в консоль выводим какая кнопка нажата
            }
        };
        for (JButton jButton : jButtons) { //циклом определяем нажатие кнопок
            add(jButton);
            jButton.addActionListener(btnListener);
        }


        setVisible(true); //чтобы окно появилось
    }

    public static void main(String[] args) {
        new MyWindow(); //вызов окна
    }
}



