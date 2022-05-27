package lesson_3;

public class Constructor {
    public static void main(String[] args) {


        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Alex0", "0@me.to", 12345678, 0, 38, "QA");
        employees[1] = new Employee("Alex1", "1@me.to", 12345678, 1, 41, "Dev");
        employees[2] = new Employee("Alex2", "2@me.to", 12345678, 2, 50, "AQA");
        employees[3] = new Employee("Alex3", "3@me.to", 12345678, 3, 22, "PM");
        employees[4] = new Employee("Alex4", "4@me.to", 12345678, 4, 27, "BA");

        for (int i = 0; i < employees.length; i++)
            if (employees[i].age > 40) {
                employees[i].print();
            }
    }
}



