package Lesson_3;

public class HW_3 {
    public static void main(String[] args) {
        //Необходимо создать две целочисленные переменные (a, b),
        // присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        //maybe a and b are even - если сумма переменных четная
        //some variable is odd - если сумма переменных нечетная
        int a = 11;
        int b = 24;
        int sum = a + b;
        if (sum % 2 == 0){
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
    }
}
