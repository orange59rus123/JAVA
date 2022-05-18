package ru.gb.leonidkoval.lesson7;

public enum Position {
    HR("отдел кадров", 1.1),
    ACCOUNT("бухгалтерия", 2),
    ENGINEER("технический отдел", 1.2),
    IT("айти отдел", 1.5),
    BOSS("начальство", 1.9);

    private String rusName;
    private double bonus;

    Position(String rusName, double bonus) {
        this.rusName = rusName;
        this.bonus = bonus;
    }


    public double getBonus() {
        return bonus;
    }

    public String getRusName() {
        return rusName;
    }

}
class Employee{
    private String fio;
    private Position position;
    private double salary;

    public Employee(String fio, Position position, int i) {
        this.fio = fio;
        this.position = position;
        this.salary = salary;
    }

    public double getSalary() {
        return salary * position.getBonus();
    }
}
class M{
    public static void main(String[] args) {
        final Position account = Position.ACCOUNT;
        System.out.println(account.getRusName());
        new Employee("koval, lev, lendch", account, 1000);
    }
}