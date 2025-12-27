public class Demo {
    public static void main(String[] args) {
        // Creating a object of student
        Student st1 = new Student();
        st1.studentName = "Gaurav";
        st1.studentId = 1;
        st1.studentCity = "Belbari";
        st1.study();
        st1.showFullDetails();
        Student st2 = new Student(5);
        Student st3 = new Student("Harry", 2, "Kathmandu");
        /* st3.studentName = "Harry";
        st3.studentId = 2;
        st3.studentCity = "Kathmandu"; */
        st3.study();
        st3.showFullDetails();
    }
}