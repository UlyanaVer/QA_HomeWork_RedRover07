package Lesson_2_variables;

public class HW_2 {
    //Задача №2
    //Создать программу дележа добычи на пиратском корабле.
    // По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану,
    // остальное делится поровну между всеми членами команды, включая капитана.
    //Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
    //Вывести на экран кому сколько пиастров полагается.
    //Дополнительное задание со звездочкой:
    //Попробовать придумать как программа может проверить правильность дележа.
    public static void main(String[] args) {

       int loot = 49;
       int crew = 4;
       int owner = loot / 2;
       int kapitan = (loot - owner) / 2;
       int eachCrew = (loot - owner - kapitan) / (crew + 1);
        kapitan = kapitan + eachCrew;

        System.out.println("Владелец получит " + owner + " пиастров");
        System.out.println("Капитан получит " + kapitan + " пиастров");
        System.out.println("Команда получит " + eachCrew * crew + " пиастров");

        if(loot == (owner + kapitan + eachCrew * crew)){
            System.out.println("Добыча поделена верно");
        }else {
            System.out.println("Кто-то присвоил себе не свои пиастры! В количестве = " +
                    (loot - (owner + kapitan + eachCrew * crew)));
        }

    }
}
