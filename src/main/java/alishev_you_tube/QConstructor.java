package alishev_you_tube;

public class QConstructor {
    public static void main(String[] args) {
        Human1 human1 = new Human1();


    }
}
class Human1 {
    private String name;
    private int age;

    public Human1(){
        this.name = "имя по умолчанию";
        this.age = 0;
        System.out.println(name + " " + age);
    }
    public Human1(String name) {
        System.out.println("привет из 2го конструктора");
        this.name = name;
    }
    public Human1(String name, int age){
        System.out.println("привет из 3го конструктора");
        this.age = age;
        this.name = name;


    }


    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
