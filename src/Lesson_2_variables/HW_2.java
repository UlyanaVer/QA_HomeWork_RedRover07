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

       int dobicha = 40;
       int komanda = 4;
       double piastriVladelec = dobicha / 2;
       double piastriKapitan = piastriVladelec / 2;
       double piastriKomanda = piastriKapitan / (komanda + 1);

       if(dobicha == (piastriVladelec + piastriKapitan + piastriKomanda + piastriKomanda * komanda)){
           System.out.println("Добыча поделена верно");
        }else {
           System.out.println("Кто-то присвоил себе не свои пиастры!");
       }

        System.out.println("Владелец получит " + piastriVladelec + " пиастров");
        System.out.println("Капитан получит " + (piastriKapitan + piastriKomanda) + " пиастров");
        System.out.println("Команда получит " + piastriKomanda * komanda + " пиастров");

    }
}
