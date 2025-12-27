package SuperKeyword;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Gaurav", "Dulal");
        Student s1 = new Student("Ram", "Kumar", 3.8);
        Employee e1 = new Employee("Sita", "Sharma", 50000);
        p1.showFullName();
        s1.showFullName();
        s1.showGpa();
        e1.showFullName();
        e1.showSalary();
    }
}