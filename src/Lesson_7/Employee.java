package Lesson_7;

public class Employee{
    public String gender;
    public String name;
    public int age;
    public double salary;
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSameName(Employee employee){
        return this.name.equals(employee.name);
    }
}
