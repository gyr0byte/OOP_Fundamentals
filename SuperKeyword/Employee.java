package SuperKeyword;

public class Employee extends Person{
    double salary;

    public Employee(String first, String last, double salary) {
        super(first, last);
        this.salary = salary;
    }
    void showSalary(){
        System.out.println(this.first + "'s salary is Rs " + this.salary);
    }
    
}
