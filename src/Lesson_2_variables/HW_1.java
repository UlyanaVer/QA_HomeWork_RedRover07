package Lesson_2_variables;

public class HW_1 {
    public static void main(String[] args) {
        //Задача №1
        //Необходимо создать целочисленные переменные a и b,
        // присвоить произвольные значения переменным на ваш выбор и
        // вывести результаты следующих операций с этими переменными:
        // сложение, умножение, вычитание, деление и остаток от деления.
        // Также сделать проверку на четность этих переменных и вывести результат.
        int a = 10;
        int b = 5;
        int sum = a + b;
        int sub = a - b;
        double div = a / b;
        int multi = a * b;
        double remainder = a % b;
        System.out.println("Результат суммирования = " + sum);
        System.out.println("Результат вычитания = " + sub);
        System.out.println("Результат умножения = " + multi);
        System.out.println("Результат деления = " + div);
        System.out.println("Остаток от деления = " + remainder);
    }
}
