package ru.gb.leonidkoval.hw7;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;


    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;

    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public void setFood(Plate p) {
        p.decreaseFood(satiety);
    }
    public boolean info() {
        if (satiety < 0) {
            return false;
        } else {
            return true;
        }
    }






    public int getAppetite() {
        return appetite;
    }
    public int getSatiety() {
        return satiety;
    }
}
