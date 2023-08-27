package Lesson_5;

public class HW_1 {
    public static void main(String[] args) {
        // Задача №1
        //
        //Дана строка:
        //String s = “Перестановочный алгоритм быстрого действия”;
        //необходимо вывести все буквы “о” из этой строки.
        //Для указанной строки ответ будет “ооооо” (или в столбик)
        String s = "Перестановочный алгоритм быстрого действия";
        String str = s.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'о'){
                System.out.print('о');
            }
        }
    }
}
