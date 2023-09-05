package Lesson_7;

public class Salary {
    static double getSum(Employee[] employeeArray){ //static  т.к. не надо знать ничего о полях класса salary
        double sum = 0;
        for (int i = 0; i < employeeArray.length ; i++) {
            Employee employee = employeeArray[i];
            sum = sum + employeeArray[i].salary;
        }
        return sum;
    }
}
