package ru.gb.leonidkoval.HW6;

public class Dog extends Animal {
    public Dog(String name, int age, double weight) {
        super(name, age, weight, 500, 10);
    }

           // без int runLimit, int swimLimit
  // public void run(int length) {
  //     if (length >= 500) {
  //         System.out.println("собаки не бегут дальше 500 м");
  //     } else {
  //         System.out.println(this + " пробежал " + length + " м."); //this вместо getName тк есть toString
  //     }
  // }

  // public void swim(int length) {
  //     if (length >= 10) {
  //         System.out.println("собаки не плывут дальше 10 м");
  //     } else {
  //         System.out.println(this + " проплыл " + length + " м."); //this вместо getName тк есть toString
  //     }
  // }

    @Override
    public String toString() {
        return "Собака по имени " + getName();
    }
}