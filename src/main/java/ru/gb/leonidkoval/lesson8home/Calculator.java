package ru.gb.leonidkoval.lesson8home;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame { // с помощью extends JFrame импорт swing

    private Double leftOperand;
    private String operation;

    public Calculator() {
        setTitle("Calculator"); //создали окно
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // при закрытии окошка программа завершается


        setBounds(450, 200, 400, 400);          //гранцы окна лев верх угол, ширина, высота
        setLayout(new BorderLayout());    //компановщик будет в BorderLayout

        final JLabel display = new JLabel("0");//создаём дисплэй изначально там ноль

        display.setHorizontalAlignment(SwingConstants.RIGHT);//печать с правой стороны
        display.setFont(new Font("Arial", Font.BOLD, 40));//настройка шрифта дисплея
        add(display, BorderLayout.NORTH);//добавляем дисплей на север

        final ActionListener numberListener = new ActionListener() {  //для кнопок

            @Override
            public void actionPerformed(ActionEvent e) {
                final JButton button = (JButton) e.getSource();
                final String text = button.getText(); //здесь лежит тот номер который написан  на кнопке
                String displayText = display.getText();
                if (".".equals(text) && display.getText().contains(".")) { //если введена точка и дисплей уже
                    // содержит точку
                    return;
                }
                if ("0".equals(displayText) && !".".equals(text)) { //убираем ноль после начала ввода цифр если
                    // первой не вводим тчк
                    displayText = "";
                }

                displayText += text;
                display.setText(displayText);
            }
        };

        final ActionListener buttonListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                final JButton source = (JButton) e.getSource();
                final String action = source.getText();
                final Double rightOperand = Double.parseDouble(display.getText());//принял на ввод строку и принял за
                // число


                if ("=".equals(action)) {
                    if (leftOperand != null) {
                        switch (operation) {
                            case "+":
                                display.setText(String.valueOf(leftOperand + rightOperand));
                                break;
                            case "-":
                                display.setText(String.valueOf(leftOperand - rightOperand));
                                break;
                            case "*":
                                display.setText(String.valueOf(leftOperand * rightOperand));
                                break;
                            case "/":
                                display.setText(String.valueOf(leftOperand / rightOperand));
                                break;
                        }
                        leftOperand = Double.parseDouble(display.getText());
                        operation = null;

                    }
                    return;
                }
                leftOperand = Double.parseDouble(display.getText());
                operation = action;
                display.setText("0");
            }
        };
        final JPanel numberPanel = new JPanel();

        final GridLayout numberLayout = new GridLayout(4, 4, 10, 10);
        numberPanel.setLayout(numberLayout); //компанощик для панели setLayout

        for (int i = 0; i < 10; i++) {
            final JButton button = new JButton(String.valueOf(i)); //String.valueOf(i) перевод инта в стринг
            button.addActionListener(numberListener);
            numberPanel.add(button);  // добавляем кнопки в numberPanel
        }

        final JButton pointButton = new JButton(".");      //создали кнопка с тчк
        pointButton.addActionListener(numberListener);
        final JButton negativeButton = new JButton("+/-");  //создали кнопка +-

        numberPanel.add(pointButton);                           // добавили кнопку

        numberPanel.add(negativeButton);                        // добавили кнопку


        //создаём кнопки со знаками
        final JPanel buttonPanel = new JPanel();
        final GridLayout buttonLayout = new GridLayout(4, 4, 13, 13);
        buttonPanel.setLayout(buttonLayout);

        for (char c : "C+-*/=".toCharArray()) {
            final JButton button = new JButton(String.valueOf(c));
            button.addActionListener(buttonListener);
            buttonPanel.add(button);
        }

        add(numberPanel, BorderLayout.CENTER); //размещаем нашу панель numberPanel в центре окна
        add(buttonPanel, BorderLayout.SOUTH); //размещаем панель со знаками на юг
        setVisible(true);


    }

    public static void main(String[] args) {
        new Calculator(); //вызов окна
    }


}
