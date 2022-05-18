package alishev_you_tube;

public class OEncapsulation {
    public static void main(String[] args) {
        Persoon persoon1 = new Persoon();

        persoon1.setName(""); //сеттер назначает
        persoon1.setAge(155);

        //persoon1.speak();

        System.out.println("выводим значение в мэйн методе: " + persoon1.getName()); //геттер выводит
        System.out.println("выводим значение в мэйн методе: " + persoon1.getAge());
    }
}
class Persoon{
    // у класса могкт быть :
    // 1 данные(поля)
    // 2 действия которые он может совершать (методы)

    private String name; //private переменную видно в переделах этого класса
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) { //изЕмпти тру если строка пуста, фолс если есть символы
            System.out.println("ты ввел пустое имя");
        } else {
        name = userName;
        }
    }
    public String getName() {
        return name;
    }


    public void setAge(int userAge){
        if(userAge < 0 || userAge > 150) {
            System.out.println("ты ввел некорректное значение возраста");
        } else {
        age = userAge;
        }
    }
    public int getAge() {
        return age;
    }

    int calculatYearsToRetirement() {  //считаем сколько осталось до пенсии
        int years = 65 - age;
        return years;
    }
    void speak() {  //метод спик отвечает за вызов нэйм и эйдж с печатью
        // for (int i = 0; i < 3; i++) {  // с помощью цикла метод будет печатать 3 раза
        System.out.println("my name is " + name + ", my age " + age + " years.");
        // }
    }


}

