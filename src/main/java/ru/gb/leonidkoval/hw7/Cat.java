package ru.gb.leonidkoval.hw7;

public class Cat {
    private String name;
    private int appetite; //сколько кот съест за один подход
    private int saturationFood; //колво калорий увеличивается на appetite после приема пищи
    private int catFullness; //необходимость калорий для сытости
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.saturationFood = 0; //колво принятых калорий сначала 0
        this.fullness = false;  //кот пока голодный
        this.catFullness = this.appetite;
    }

    public boolean isFullness() {
        return fullness;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getSaturationFood() {
        return saturationFood;
    }

    public int getCatFullness() {
        return catFullness;
    }

    public void eat(Plate p) {
        if (this.fullness) {
            return;
        }
        if (p.decreaseFood(this.appetite)) {
            System.out.printf("%s съел %d калорий\n", this.name, this.appetite);
            this.saturationFood += this.appetite;
            if (this.saturationFood == this.catFullness){ //если кот сыт то
                this.fullness = true;                     // тру
            }
        }
    }
}
