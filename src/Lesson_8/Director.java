package Lesson_8;

public class Director extends Manager {
    public int getPercent() {
        return 9;
    }

    @Override
    public double getSalary() {
            return (getBaseSalary() + (getBaseSalary() * numberOfSubordinates * getPercent() / 100));
    }
}