package ru.gb.leonidkoval.HW6;

public class Cat extends Animal {
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }


    public void run(int a){
    if (a >= 200){
        System.out.println("Кошки не бегут дальше 200 м");
    } else{
        System.out.println(getName() + " пробежал " + a + " м.");
    }
    }
    public void swim(int a){
        System.out.println("Кошки не умеют плавать");
    }
}

