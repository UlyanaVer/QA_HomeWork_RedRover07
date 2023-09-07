package Lesson_8;

public class Worker extends Employee{
    @Override
    public double getSalary(){
        return getBaseSalary();
    }
}
