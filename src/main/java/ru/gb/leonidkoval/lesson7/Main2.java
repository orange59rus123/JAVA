package ru.gb.leonidkoval.lesson7;

import java.util.Objects;

class Cat{
    private String name;
    private int age;
    private double weight;

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
//переопределяем метод туСтринг чтобы поля класса определялись правильно
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    //это все изза alt+ins equals next для сравнения переменных
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Myrxik", 1, 2);
        Cat cat2 = new Cat("Myrxik", 1, 2);

        System.out.println(cat1.equals(cat2)); //true после alt+ins equals next ..
        System.out.println(cat1 == cat2);
        System.out.println(cat1.toString());

        String a = "abc";
        a += "+def";
        String b = "+ghi";
        System.out.println(a + b); //складывание строк



        //для прибавления строк в цикле не занимая большей производительности и места
        StringBuilder x = new StringBuilder();
        for (int i = 0; i < 100; i++){
            x.append("*" + i);
        }
        System.out.println(x.toString());

    }
}
