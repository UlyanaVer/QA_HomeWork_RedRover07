package Lesson_4;

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

        int positivCount = 0;
        int negativCount = 0;
        int[] array = new int[]{1, 2, 4, 6, 8, 9, -2, -5, -10, 100, 99, 54, -103, 0};
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            if (elem > 0) {
                positivCount++;
            } else if (elem < 0) {
                negativCount++;
            }
        }
        boolean isSorted = true;
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] > array[j + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Массив отсортирован");
        } else {
            System.out.println("Массив не отсортирован");
        }

        System.out.println();
        System.out.print("Количество положительных чисел = ");
        System.out.println(positivCount);

        System.out.print("Количество отрицательных чисел = ");
        System.out.println(negativCount);
    }
}
