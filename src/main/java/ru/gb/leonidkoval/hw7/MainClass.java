package ru.gb.leonidkoval.hw7;


import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Son", 200),
                new Cat("Sunny", 250),
                new Cat("Sony", 300),
                new Cat("bigS", 500)
        };
        System.out.println("укажи количество калорий в первой порции");

        Plate plate = new Plate(new Scanner(System.in).nextInt());

        for (Cat a : cats) {
            while (!a.isFullness() && plate.getFood() >= a.getAppetite()) { //кот не сытый И в тарелке БОЛЬШЕ чем кот
                                                                            // съедает за раз
                a.eat(plate);                                               // кот ест
                plate.info();
            }
        }
        for (Cat a : cats) {
            if (a.isFullness()) {
                System.out.printf("%s наелся\n", a.getName());
            } else {
                System.out.printf("%s голоден, не хватило %d калорий\n", a.getName(),
                        a.getCatFullness() - a.getSaturationFood());
            }
        }
        System.out.println("укажи количество калорий во второй порции");

        Plate plate2 = new Plate(new Scanner(System.in).nextInt());
    }




}

//2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
//удалось покушать (хватило еды), сытость = true.
//3. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
//наполовину сыт (это сделано для упрощения логики программы).
//4. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
//потом вывести информацию о сытости котов в консоль.
//5. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.