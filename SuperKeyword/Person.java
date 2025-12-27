package SuperKeyword;
public class Person {
    String first;
    String last;

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }
    void showFullName() {
        System.out.println("Full Name: " + first + " " + last);
    }
}
