package Lesson_5;

public class HW_3 {
    public static void main(String[] args) {
        //Задача №3
        //
        //Дана строка:
        //String s = “Посмотрите как Рите нравится ритм”;
        //необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        //Для указанной строки ответ будет 6, 15, 29.
        String s = "Посмотрите как Рите нравится ритм";
        String str = s.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'р') {
                if (str.charAt(i + 1) == 'и') {
                    if (str.charAt(i + 2) == 'т') {
                    }
                    System.out.println(i);
                }
            }
        }
        System.out.println();
        System.out.println("Второй вариант: ");
        for (int i = 0; i < s.length() - 3; i++) {
            if (s.substring(i, i + 3).equalsIgnoreCase("рит")) {
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Третий вариант: ");
        int index = str.indexOf("рит");
        while (index != -1) { // -1 возвращает, когда ничего не нашел
            System.out.println(index);
            index = str.indexOf("рит", index + 1);
        }
    }
}