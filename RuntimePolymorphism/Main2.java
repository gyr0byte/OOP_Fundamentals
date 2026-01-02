package RuntimePolymorphism;

public class Main2 {
    public static void main(String[] args) {
    Person person = new Person();
    person.showDetails(); // Outputs: Details of Person
    Ram ram = new Ram();
    ram.doWork(person); // Outputs: Details of Person
 }
}