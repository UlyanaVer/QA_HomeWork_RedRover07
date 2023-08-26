package Lesson_4;

import java.util.Arrays;

public class HW_10 {
    public static void main(String[] args) {
        //Задача №10
        //Дано положительное целое число n.
        //создать ряд из n чисел так, чтобы:
        //первые два элемента ряда равнялись 1
        //любой другой элемент ряда был суммой двух предыдущих.
        //Пример:
        //1, 1, 2, 3, 5, 8, …
        //Вывести получившийся ряд на экран.
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i < 11; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        int number =  20;
        int[] fibonacciSequence  = new int [number];
        int prevoius = 0;
        int current = 1;
        fibonacciSequence[0] = current;
        for (int i = 1; i < number; i++) {
            fibonacciSequence[i] = prevoius + current;
            prevoius = current;
            current = fibonacciSequence[i];
        }
        System.out.println();
        System.out.println("Второй вариант: ");
        System.out.println(Arrays.toString(fibonacciSequence));

        System.out.println("3 вариант: ");
        int number1 =  20;

        int[] fibonacciSequence1  = new int [number1];
        for (int i = 0; i < number1; i++) {
            if(i ==0 || i == 1){
                fibonacciSequence1[i] = 1;
            } else {
                fibonacciSequence1[i] = fibonacciSequence1[i - 1] + fibonacciSequence1[i -2];
            }
        }
        System.out.println(Arrays.toString(fibonacciSequence1));
        }
}

