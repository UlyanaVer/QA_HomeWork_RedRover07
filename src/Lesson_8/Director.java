package Lesson_8;

public class Director extends Manager {
    public int getPercent() {
        return 9;
    }

//    @Override
//    public int getSalary() {
//        if (numberOfSubordinates != 0) {
//            return (getBaseSalary() + (getBaseSalary() * numberOfSubordinates * getPercent()/ 100));
//        } else {
//            return getBaseSalary();
//        }
//    }
}