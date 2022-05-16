package ru.gb.leonidkoval.HW6;

public class Cat extends Animal {
    public Cat(String name, int age, double weight) {super(name, age, weight, 200,0);
    }

    // без int runLimit, int swimLimit
 //public void run(int length){
 //if (length >= 200){
 //    System.out.println("Кошки не бегут дальше 200 м");
 //} else{
 //    System.out.println(this + " пробежал " + length + " м."); //this вместо getName тк есть toString
 //}
 //}
 public void swim(int length){
     System.out.println("Кошки не умеют плавать");
 }

    @Override
    public String toString() {
        return "Кот по имени " + getName();
    }
}