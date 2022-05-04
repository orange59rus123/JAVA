package ru.gb.leonidkoval.HW6;

public class HW6 {
    public static void main(String[] args) {

        Cat cat = new Cat("Пушок", 2, 2);
        Cat cat2 = new Cat("Пуш", 3, 1);
        Cat cat3 = new Cat("Шок", 2, 2);
        Dog dog = new Dog("Барон", 4, 9);
        Dog dog2 = new Dog("Бар", 5, 7);
        Dog dog3 = new Dog("Рон", 4, 9);

        System.out.println("Забег животных");
        System.out.println();
        System.out.println("Кошки на старт!");
        System.out.println();
        cat.run(220);
        cat2.run(58);
        cat3.run(92);
        System.out.println();
        System.out.println("Собаки на старт!");
        System.out.println();
        dog.run(67);
        dog2.run(624);
        dog3.run(77);
        System.out.println();
        System.out.println("Плавание животных");
        System.out.println("Кошки на старт!");
        System.out.println();
        cat.swim(27);
        cat2.swim(70);
        cat3.swim(26);
        System.out.println();
        System.out.println("Собаки на старт!");
        System.out.println();
        dog.swim(7);
        dog2.swim(27);
        dog3.swim(6);
        System.out.println();
        Animal[] animals = new Animal[]{cat, cat2, cat3, dog, dog2, dog3};

        System.out.println("число участвующих животных в забеге = " + animals.length);
    }
}
