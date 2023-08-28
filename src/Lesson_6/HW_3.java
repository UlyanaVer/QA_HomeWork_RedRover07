package Lesson_6;

public class HW_3 {
    public static int sum(int a,int b){
        return a + b;
    }

    public static double sub(double a, double b ){
        return a - b;
    }

    public static double multiplication(double a, double b){
        return a * b ;
    }

    public static double div(double a, double b){
        return a / b;
    }
    public static void main(String[] args) {
//Задача №1
//Необходимо написать 4 метода:
//сложение 2х чисел
//вычитание 2х чисел
//умножение 2х чисел
//деление 2х чисел

        System.out.println(sum(12,23));
        System.out.println(sub(3.7,8));
        System.out.println(multiplication(9,5.6));
        System.out.println(div(10,3));

    }
}