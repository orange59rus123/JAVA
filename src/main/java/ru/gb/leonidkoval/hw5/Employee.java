package ru.gb.leonidkoval.hw5;
public class Employee {

  private String name;
  private String position;
  private String email;
  private int numPhoneWork;
  private int salary;
  private int age;

  public Employee(String name, String position, String email, int numPhoneWork, int salary, int age) {
    this.name = name;
    this.position = position;
    this.email = email;
    this.numPhoneWork = numPhoneWork;
    this.salary = salary;
    this.age = age;
}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", numPhoneWork=" + numPhoneWork +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getAge()  {
        return age;
    }

// toString лучше и быстрее этого
    //public void print() {
    //System.out.println("name= " + name +
    //        ", position= " + position +
    //        ", email= " + email +
    //        ", numPhoneWork= " + numPhoneWork +
    //        ", salary= " + salary +
    //        ", age=" + age);
    //  }

  }