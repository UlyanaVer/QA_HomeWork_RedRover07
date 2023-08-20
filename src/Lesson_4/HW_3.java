package Lesson_4;

public class HW_3 {
    public static void main(String[] args) {
        //Задача №3
        //Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        //Реализовать 2 варианта:
        //использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        //без использования конструкции if (шаг цикла на ваше усмотрение).
        System.out.println("%4");
        for (int i = 40; i <= 60 ; i++) {
            if(i % 4 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("с шагом 4");
        for (int i = 40; i <= 60; i = i + 4) {
            System.out.print(i + " ");
        }
    }
}
