package lesson_3;

public class Employee {
    public String name;
    public String email;
    public int phone;
    public int salary;
    public int age;
    public String profession;

    public Employee(String name, String email, int phone, int salary, int age, String profession) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        this.profession = profession;
    }

    public void print() {
        System.out.println("Имя:" + name + "; Должность:" + profession + "; Email:" + email + "; Телефона:" + phone + "; Зарплата:" + salary + "; Возраст:" + age + ".");
    }
}
