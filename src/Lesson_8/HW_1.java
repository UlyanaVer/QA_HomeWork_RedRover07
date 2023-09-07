package Lesson_8;

public class HW_1 {
    public static void main(String[] args) {
        //Задача №1
        //
        //Необходимо создать класс Employee со следующими методами:
        //getBaseSalary - получить базовую ставку
        //setBaseSalary
        //getName - получить имя
        //setName
        //getSalary - получить зарплату
        //
        //
        //Задача №2
        //
        //Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.
        //
        //Необходимо создать класс Manager в который нужно добавить следующие методы:
        //getNumberOfSubordinates - получить количество подчиненных
        //setNumberOfSubordinates
        //
        // в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.
        //
        //Необходимо создать класс Director с теми же методами, что и Manager,
        // но метод getSalary должен возвращать результат по формуле
        // - <базовая ставка> * (<количество подчиненных> / 100 * 9).
        // Если количество подчиненных 0, то результат как у обычного рабочего.
        //
        //Задача №3
        //
        //Необходимо создать утилитарный класс со следующими методами:
        //поиск сотрудника в массиве по его имени
        //поиск сотрудника в массиве по вхождению указанной строки в его имени
        //подсчет зарплатного бюджета для всех сотрудников в массиве
        //поиск наименьшей зарплаты в массиве
        //поиск наибольшей зарплаты в массиве
        //поиск наименьшего количества подчиненных в массиве менеджеров
        //поиск наибольшего количества подчиненных в массиве менеджеров
        //поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
        //поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

//Задача №1
        Worker worker1 = new Worker();
        worker1.setBaseSalary(100);
        worker1.setName("Лариса");
        System.out.println("Worker 1 = " + worker1.getSalary());

        Manager manager1 = new Manager();
        manager1.setBaseSalary(300);
        manager1.setName("Василий");
        manager1.setNumberOfSubordinates(2);
        System.out.println("Manager 1=" + manager1.getSalary());

//        System.out.println("Сотрудник: " + worker1.getName() + " Ставка = " + worker1.baseSalary
//                + " Зарплата = " + worker1.getSalary());
//
//        System.out.println("Сотрудник: " + manage1.getName() + " Ставка = " + manage1.baseSalary
//                + " Зарплата = " + manage1.getSalary());
//Задача №2
        Worker worker2 = new Worker();
        worker2.setName("Володя");
        worker2.setBaseSalary(150);
        System.out.println("Базовая ставка рабочего: " + worker2.getSalary());

        Manager manager2 = new Manager();
        manager2.setName("Хаврошка");
        manager2.setBaseSalary(500);
        manager2.setNumberOfSubordinates(1000);
        System.out.println("Manager 2=" + manager2.getSalary());

//        System.out.println("Менеджер: " + manager2.getName() + " Ставка = " + manager2.baseSalary
//                + " Количество подчиненных = " + manager2.numberOfSubordinates + " Зарплата = " + manager2.getSalary());

        Director director = new Director();
        director.setName("Зайцев Вадим Игоревич");
        director.setBaseSalary(5000);
        director.setNumberOfSubordinates(1000);
        System.out.println("Director = " + director.getSalary());

        Director director1 = new Director();
        director1.setName("VAdik");
        director1.setBaseSalary(5000);
        director1.setNumberOfSubordinates(1000);
        System.out.println("Director1 = " + director1.getSalary());

        Director director3 = new Director();
        director3.setName("Зайцев Вадим Игоревич333");
        director3.setBaseSalary(500);
        director3.setNumberOfSubordinates(5);
        System.out.println("Director3 = " + director3.getSalary());

//        System.out.println("Директор " + director.name +  " Зарплата = " + director.getSalary() + " Количество подчиненных = "
//                + director.numberOfSubordinates + " Ставка = " + director.baseSalary);
//        System.out.println("Директор " + director1.name +  " Зарплата = " + director1.getSalary() + " Количество подчиненных = "
//                + director1.numberOfSubordinates + " Ставка = " + director1.baseSalary);

//Задача №3
        Employee[] employeesMas = new Employee[]{worker1, manager1,manager2, director, director1, director3, worker2};

        Employee emp = EmployeeUtils.findByName(employeesMas, "Лариса");
        System.out.println("Task_3_1: " + emp.getName());

        Employee emp1 = EmployeeUtils.findBySubName(employeesMas, "Зайцев");
        System.out.println("Task_3_2: " + emp1.getName());

        EmployeeUtils TotalSalary = new EmployeeUtils();
        System.out.println("TotalSalary = : " + TotalSalary.getTotalSalary(employeesMas));

        System.out.println("MaxSalary: = " + EmployeeUtils.getMaxSalary(employeesMas));
        System.out.println("MinSalary: = " + EmployeeUtils.getMinSalary(employeesMas));

        Manager[] ManagerMas = new Manager[]{manager1,manager2, director, director1, director3};

        System.out.println("MaxBonus: = " + EmployeeUtils.getMaxBonus(ManagerMas));
        System.out.println("MaxNumSubordinates: = " + EmployeeUtils.getMaxNumSubordinates(ManagerMas));
        System.out.println("MinNumSubordinates: = " + EmployeeUtils.getMinNumSubordinates(ManagerMas));
    }
}
