package alishev_you_tube;

public class NClassesAndObjects {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Leo";
    person1.age = 33;

    person1.sayHello();
    person1.speak(); //вызов метода спик для персон1
    person1.calculatYearsToRetirement();

        System.out.println();

    Person person2 = new Person();
    person2.name = "Mari";
    person2.age = 32;
    person2.sayHello();
    person2.speak(); //вызов метода спик для персон2
    person2.calculatYearsToRetirement();  //вызов метода для расчета лет до пенсии

        int year2 = person2.calculatYearsTo50(); //присвоение возвращения метода переменной еар2
        int year1 = person1.calculatYearsTo50();
        System.out.println("второму человеку до 50 лет осталось " + year2 + " лет!!");
        System.out.println("первому человеку до 50 лет осталось " + year1 + " лет!!");

        System.out.println();

        Person person3 = new Person();
        person3.setNameAndAge("Stepan", 6);  //при вызове метода передали стринг Степан и инт 6
        person3.speak();




    }
}
class Person{
    // у класса могкт быть :
    // 1 данные(поля)
    // 2 действия которые он может совершать (методы)

    String name;
    int age;

    void speak() {  //метод спик отвечает за вызов нэйм и эйдж с печатью
       // for (int i = 0; i < 3; i++) {  // с помощью цикла метод будет печатать 3 раза
            System.out.println("my name is " + name + ", my age " + age + " years.");
       // }
    }

    void sayHello(){  //void - тип вывода данных с метода
        System.out.println("Hello");
    }

    void calculatYearsToRetirement() {  //считаем сколько осталось до пенсии
        int years = 65 - age;
        System.out.println("до пенсии осталось " + years + " года(лет).");
    }

    int calculatYearsTo50(){ //сколько лет до 50 лет, возвращаем из метода инт!
        int to = 50 - age;
        return to; //возврат инта
    }

    void setNameAndAge(String username, int x) { //на вызов метода принимает стринг и инт
        name = username;
        age = x;


    }
}
