package ru.gb.leonidkoval.HW6;
//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается
// длина препятствия. Результатом выполнения действия будет печать в консоль.
// (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
// плавание: кот не умеет плавать, собака 10 м.).

//4. * Добавить подсчет созданных котов, собак и животных.
public abstract class Animal {
    private String name;
    private int age;
    private double weight;
    private int runLimit;  //предел по методам
    private int swimLimit; //предел по методам

    public Animal(String name, int age, double weight, int runLimit, int swimLimit) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

     public void run(int length) {
         if (length >= runLimit) {
             System.out.println(this + " не бегут дальше");
         } else {
             System.out.println(this + " пробежал " + length + " м."); //this вместо getName тк есть toString
         }
     }

     public void swim(int length) {
         if (length >= swimLimit) {
             System.out.println(this + " не проплывет столько");
         } else {
             System.out.println(this + " проплыл " + length + " м."); //this вместо getName тк есть toString
         }
     }
}


