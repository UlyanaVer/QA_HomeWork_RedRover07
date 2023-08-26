package Lesson_4;

public class HW_4_7 {
    public static void main(String[] args) {
        //Задача №5
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести максимальное значение массива.
        //Задача №6
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести минимальное значение массива.
        //Задача №7
        //Дан массив:
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //необходимо вывести среднее арифметическое всех значений массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            int elem = array[i];
                if (elem > max){
                max = elem;
                }
            if (elem < min){
                min = elem;
            }
        }
        System.out.print("MAX = ");
        System.out.println(max);

        System.out.print("MIN = ");
        System.out.println(min);

        System.out.print("Среднее арифметичесое = ");
        System.out.println((double)sum / array.length  );

        System.out.println();
        System.out.println(sum);
    }
}
