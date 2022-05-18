package alishev_you_tube;

public class PLessonThis {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Leo");
        human1.setAge(32);
        human1.getInfo();
    }
}
class Human{
    String name;
    int age;

    public void setName(String name){ //this если переменная в скобках совпадают с вышеуказаной переменной
        this.name = name; //this для обращения к имени переменной КЛАССА
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name + " " + age);
    }
}