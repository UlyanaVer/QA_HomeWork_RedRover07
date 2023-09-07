package Lesson_8;

public class Worker extends Employee{
    @Override
    public int getSalary(){
        return getBaseSalary();
    }
}
