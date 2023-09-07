package Lesson_7;

import Lesson_8.EmployeeUtils;

public class HW_1 {
    //Задача №1
    //
    //Необходимо создать класс Person с полями: имя, возраст, пол.
    // Класс должен иметь метод - getName,
    // метод возвращает имя с префиксом “Mr. ”
    // если пол указан как мужской и префикс
    // “Mrs. ” если женский.

    //Задача №2
    //
    //Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
    // Класс должен иметь метод isSameName(Employee employee) который возвращает true,
    // если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
    //
    //Задача №3
    //
    //Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
    //метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
    public static void main(String[] args) {
//Задача №1
        Person vasya = new Person();
        vasya.gender = "male";
        vasya.name = "Василий";

        System.out.println("All about vasya: " + vasya.getName());

        Person larisa = new Person();
        larisa.gender = "female";
        larisa.name = "Лариса";

        System.out.println("All about larisa: " + larisa.getName());
//Задача №2
        Employee managerVasya = new Employee();
        managerVasya.name = "Василий";
        managerVasya.gender = "male";
        managerVasya.salary = 456;

        Employee managerVasya1 = new Employee();
        managerVasya1.name = "Василий";
        managerVasya1.gender = "male";
        managerVasya1.salary = 136;

        Employee managerLarisa = new Employee();
        managerLarisa.setName("Лариса");
        managerLarisa.gender = "female";
        managerLarisa.salary = 999;

        System.out.println("All about employeeVasya2: " );
        System.out.println(managerVasya.isSameName(managerVasya1));
        System.out.println(managerLarisa.isSameName(managerVasya));

//Задача №3
        Employee[] employees = new Employee[]{managerLarisa, managerVasya, managerVasya1};
        System.out.println(Salary.getSum(employees));

    }
}
