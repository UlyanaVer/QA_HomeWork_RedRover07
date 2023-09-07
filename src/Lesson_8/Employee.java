package Lesson_8;

public abstract class Employee {
    double baseSalary;
    String name;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public abstract double getSalary();
}

