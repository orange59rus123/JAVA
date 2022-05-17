package ru.gb.leonidkoval.hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }
    public void deFood(int n) {
        food -= n;
    }

    public void info() {
        if (food < 0) {
            System.out.println("в тарелке не хватит еды с таким аппетитом");
        } else {
            System.out.println("plate: " + food);
        }
    }

    public int getFood() {
        return food;
    }


}

