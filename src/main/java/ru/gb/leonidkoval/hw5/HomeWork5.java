package ru.gb.leonidkoval.hw5;
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//   2. Конструктор класса должен заполнять эти поля при создании объекта.
//   3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
//   консоль.
//   4. Создать массив из 5 сотрудников.
//              Пример:
//              Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//              persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
//              30000, 30); // потом для каждой ячейки массива задаем объект
//              persArray[1] = new Person(...);
//              ...
//              persArray[4] = new Person(...);
//   5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Petrov Petr Petrovich", "director", "petrov@mail.ru", 100, 50000, 48);
        persArray[1] = new Employee("Lvov Lev L'vovich", "accountant", "lvov@mail.ru", 101, 45000, 42);
        persArray[2] = new Employee("Andreev Andrei Andreevich", "manager", "andreev@mail.ru", 102, 40000, 38);
        persArray[3] = new Employee("Nikolaev Nikola Nikolaevich", "driver", "Nikolaev@mail.ru", 103, 40000, 28);
        persArray[4] = new Employee("Vitalin Vitalii Vitalevich", "driver", "vitalin@mail.ru", 104, 40000, 22);
        for (Employee var : persArray)
            if (var.getAge() > 40) {
                System.out.println(var);
            }
    }
}

