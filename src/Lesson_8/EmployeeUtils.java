package Lesson_8;

public class EmployeeUtils {
    //Задача №3
    //
    //Необходимо создать утилитарный класс со следующими методами:
    //поиск сотрудника в массиве по его имени
    public static Employee findByName(Employee[] employees, String name){
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            if(name.equals(e.getName())){
                return e;
            }
        }
        return null;
    }
    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee findBySubName(Employee[] employees, String substring){
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            if(e.getName().contains(substring)){
                return e;
            }
        }
        return null;
    }
    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public double getTotalSalary(Employee[] employees){
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }
    //поиск наименьшей зарплаты в массиве
    public double getMaxSalary(Employee[] employees){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            int elem = employees[i].getSalary();
            if(elem > max){
                max = elem;
            }
        }
        return max;
    }
    //поиск наибольшей зарплаты в массиве
    public double getMinSalary(Employee[] employees){
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            double elem = employees[i].getSalary();
            if(elem < min){
                min = elem;
            }
        }
        return min;
    }
    //поиск наименьшего количества подчиненных в массиве менеджеров
    public int getMinNumSubordinates(Manager[] managers){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            int elem = managers[i].getNumberOfSubordinates();
            if (elem < min){
                min = elem;
            }
        }
        return min;
    }
    //поиск наибольшего количества подчиненных в массиве менеджеров
    public int getMaxNumSubordinates(Manager[] managers){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < managers.length; i++) {
            int elem = managers[i].getNumberOfSubordinates();
            if (elem > max){
                max = elem;
            }
        }
        return max;
    }
    //поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public double getMaxBonus(Manager[] managers){
        double max = 0;
        for (int i = 0; i < managers.length; i++) {
            Manager m = managers[i];
            double bonus = m.getSalary() - m.getBaseSalary();
            if (bonus > max){
                max = bonus;
            }
        }
        return max;
    }
    //поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public double getMinBonus(Manager[] managers){
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            Manager m = managers[i];
            double bonus = m.getSalary() - m.getBaseSalary();
            if (bonus < min){
                min = bonus;
            }
        }
        return min;
    }
}
