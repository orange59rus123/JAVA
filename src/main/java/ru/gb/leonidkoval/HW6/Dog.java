package ru.gb.leonidkoval.HW6;

public class Dog extends Animal {
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }
    public void run(int a){
        if (a >= 500){
            System.out.println("собаки не бегут дальше 500 м");
        } else{
            System.out.println(getName() + " пробежал " + a + " м.");
        }
    }
}
