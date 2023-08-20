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
    }
}
