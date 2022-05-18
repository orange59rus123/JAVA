package alishev_you_tube;

public class RStatic {
    public static void main(String[] args) {
        Human2 h1 = new Human2("bob", 25);
        h1.setName("Tom"); //теперь его зовут ТОМ



    }
}
class Human2 {
    private String name;
    private int age;

    public Human2(String name, int age){
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

