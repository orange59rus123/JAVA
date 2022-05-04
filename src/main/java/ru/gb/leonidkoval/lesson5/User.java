package ru.gb.leonidkoval.lesson5;

/*принципы ооп
 0 - абстракция
 1 - инкапсуляция - закрытие кода от остальных но не от программиста
 */
public class User {
    private String firstName; //имя
    private String lastName;  //фамилия
    private String email;
    private int age;
    private boolean male;// мужчина тру женщина фолс

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }



    // геттер метод только для чтения
    // сеттер метод только для записи

    public String getFirstName() { //даём разрешение на чтение чз get геттер
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setAge(int age) {
        if (age >= 0 && age < 250) { //ограничили ввод возраста от 0 до 250л
            this.age = age;
        }
    }



    public User(String firstName, String lastName, String email, int age, boolean male){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        setAge(age);  // proverka 4erez if esli trebuetsa
        this.male = male;
    }

    public User(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = "work@mail";  // vsegda budet u vseh
        setAge(age);  // proverka 4erez if esli trebuetsa
        this.male = true;  // vsegda budet true u vseh
    }
}