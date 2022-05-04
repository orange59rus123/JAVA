package ru.gb.leonidkoval.lesson5;
//видеоконференция
public class Lesson5 {
    public static void main(String[] args) {
       // User u1 = new User(); //объект класса User, отсылается к классу User
       // User u2 = new User();
        User u3 = new User("Petr", "Petrov", "petrov@mail.ru", -58, true);




       //u1.firstName = "IVAN"; если Name не приват
      //  u1.setFirstName("IVAN");    //передаём значения поочередно
      //  u1.setLastName("IVANOV");
      //  u1.setEmail("ivanov@mail.ru");
      //  u1.setMale(true);
      //  u1.setAge(25);
//
      //  u2.setFirstName("DIVAN");
      //  u2.setLastName("DIVANOV");
      //  u2.setEmail("divanov@mail.ru");
      //  u2.setMale(true);
      //  u2.setAge(55);

       // u2.firstName = "PETR";
       // u2.age = 58;
        System.out.println("u3.firstName = " + u3.getFirstName()); //прочитали увидели get() но поменять не можем
        System.out.println("u3.age = " + u3.getAge());
    }
}
