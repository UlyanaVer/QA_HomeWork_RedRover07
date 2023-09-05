package Lesson_7;

public class Person {
    public String gender;
    public String name;
    public int age;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender(){
        if (gender == "male") {
            return "Mr. ";
        }
        else if (gender == "female") {
            return "Mrs. ";
        }
        return gender;
    }
    public String getName() {
        return getGender() + name;
    }
}