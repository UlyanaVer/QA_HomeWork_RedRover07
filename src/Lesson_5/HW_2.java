package Lesson_5;

public class HW_2 {
    public static void main(String[] args) {
        //Задача №2
        //
        //Дана строка:
        //String s = “Перевыборы выбранного президента”;
        //необходимо подсчитать количество букв “е” в строке.
        //Для указанной строки ответ будет 4.
        String s = "Перевыборы выбранного президента";
        String str = s.toLowerCase();
        int count = 0;
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i) == 'е'){
                count++;
            }
        }
        System.out.println(count);
    }
}
