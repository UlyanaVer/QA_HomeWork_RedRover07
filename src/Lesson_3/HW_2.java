package Lesson_3;

public class HW_2 {
    public static void main(String[] args) {
        //Необходимо создать целочисленную переменную,
        //присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
        //больше 10 - если переменная больше 10
        //меньше 100 - если переменная меньше 100
        //результат деления на 2 больше 20 - если это соответствует истине
        //значение переменной между 5 и 40 включительно - если это правда
        //значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
        int variable = 999;

        if (variable > 10){
            System.out.println("variable > 10= " + variable);
        } else {
            if (variable < 100){
                System.out.println("variable < 100= " + variable);
            }
        }
        if ((variable / 2) > 20){
            System.out.println("variable/2 = " + (variable / 2));
        } else {
            if (5 <= variable && variable <= 40){
                System.out.println("5 <= variable <= 40= " + variable);
            }else{
                System.out.println("variable < 5 and variable > 40= " + variable);
            }
        }
    }
}
