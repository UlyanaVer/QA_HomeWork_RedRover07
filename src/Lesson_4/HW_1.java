package Lesson_4;

import java.util.Arrays;

public class HW_1 {
    public static void main(String[] args) {
        //Задача №1
        //Необходимо вывести числа от 0 до 15.
        int[] arr = new int[16];
        int[] result = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            int elem = arr[i];
            result [i] = elem + i;
        }
        System.out.println(Arrays.toString(result));
    }
}
