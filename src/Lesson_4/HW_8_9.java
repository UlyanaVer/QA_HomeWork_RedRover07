package Lesson_4;

import java.util.Arrays;

public class HW_8_9 {
    public static void main(String[] args) {
        //Задача №8
        //Дан массив произвольных целых чисел.
        //необходимо подсчитать количество положительных и отрицательных чисел в этом массиве.
        //Задача №9
        //Дан массив произвольных целых чисел.
        //проверить, отсортирован ли он, т.е. все ли числа в массиве стоят так,
        //что каждое следующее число больше предыдущего.
        //    public static boolean isSorted(int[] a)
        //    {
        //        // базовый вариант
        //        if (a == null || a.length <= 1) {
        //            return true;
        //        }
        //
        //        for (int i = 0; i < a.length - 1; i++)
        //        {
        //            if (a[i] > a[i + 1]) {
        //                return false;
        //            }
        //        }
        //
        //        return true;
        //    }
        int count = 0;
        int negativCount = 0;
        int[] array = new int[]{1,2,4,6,8,9,-2,-5,-10,100,99,54,-103,0};
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            if(elem >= 0){
                count ++;
            } else {
                negativCount ++;
            }
        }

        for (int j = 0,k = 1; j < array.length && k < (array.length - 1); j++, k++) {
            if (array[j] > array[k]){
                System.out.println("Массив не отсортирован");
                break;
            } else {
                System.out.print(array[j] + " ");
            }
        }
        System.out.println();
        System.out.print("Количество положительных чисел = ");
        System.out.println(count);

        System.out.print("Количество отрицательных чисел = ");
        System.out.println(negativCount);
    }
}
