package Lesson_8;

public abstract class Employee {
    int baseSalary;
    String name;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary(){
        return baseSalary;
    }
    public abstract int getSalary();
}

