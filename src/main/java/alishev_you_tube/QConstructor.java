package alishev_you_tube;

public class QConstructor {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 45);
        Human h2 = new Human("Bobs", 5);
        Human h3 = new Human("Bobst", 57);
        h2.PrintNumberPeople(); //выведет колво объектов 3
        Human h4 = new Human("Bob", 45);
        Human h5 = new Human("Bobs", 5);
        Human h6 = new Human("Bobst", 57);
        h2.PrintNumberPeople(); //выведет колво объектов 6
        h1.setName("buba");  //с помощью сет меняем
        h1.setAge(55);        //с помощью сет меняем
    }


}
class Human {
    private String name;
    private int age;
    private static int countPeople;//статик если меняется то сохраняется последнее значение переменной



    public Human(String name, int age){
        this.age = age;
        this.name = name;
        countPeople++;// при вызове конструктора увеличивается на один


    }


    public void setName(String name) {  //с помощью гет передаем в класс для чтения
        this.name = name;
    }
    public void setAge(int age) {        //с помощью гет передаем в класс для чтения
        this.age = age;
    }

    public void PrintNumberPeople() {
        System.out.println("колво людей = "+ countPeople);
    }
}
