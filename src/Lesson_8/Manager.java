package Lesson_8;

public class Manager extends Employee{
    int numberOfSubordinates;

    public int getPercent() {
        return 3;
    }

    int percent = 3;
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(){
        return getBaseSalary() + (getBaseSalary() * numberOfSubordinates * getPercent() / 100);
    }
}
