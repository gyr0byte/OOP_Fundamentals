
class Student {
    int studentId;
    String studentName;
    String studentCity;

    //Creating constructor
    public Student() {
        this(12);
        System.out.println("Object is created using Constructor (non parameterized)");
    }
    public Student(int st){
        System.out.println("Object is created using Constructor (parameterized)");
    }
    // this keyword is used to refer current class instance variable
    public Student(String studentName, int studentId, String studentCity) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentCity = studentCity;
    }
    public void study() {
        System.out.println(studentName + " is Studying");
    }

    public void showFullDetails() {
        System.out.println("My name is " + studentName);
        System.out.println("My ID is " + studentId);
        System.out.println("I live in " + studentCity);
    }
}