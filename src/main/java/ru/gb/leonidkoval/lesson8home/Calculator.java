package ru.gb.leonidkoval.lesson8home;


import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {                          // с помощью extends JFrame импорт swing
    public Calculator() {
        setTitle("Calculator"); //создали окно
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // при закрытии окошка программа завершается
        setBounds(450, 200, 400, 400);          //гранцы окна лев верх угол, ширина, высота
        setLayout(new BorderLayout());    //компановщик будет в BorderLayout
        final JPanel numberPanel = new JPanel();  //создали отдельную панель
        final GridLayout numberLayout = new GridLayout(4, 4, 10, 10); //размещение в табличке 4*4
                                                                               // с такими промежутками м-у элементами

        numberPanel.setLayout(numberLayout); //компанощик для панели setLayout

        for (int i = 0; i < 10; i++) {
            final JButton button = new JButton(String.valueOf(i)); //String.valueOf(i) перевод инта в стринг
            numberPanel.add(button);  // добавляем кнопки в numberPanel
        }

        add(numberPanel, BorderLayout.CENTER); //размещаем нашу панель numberPanel в центре окна
        setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator(); //вызов окна
    }


}
