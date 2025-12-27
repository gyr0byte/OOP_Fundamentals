package constructorsOverloading;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Sirjan");
        User u2 = new User("Gaurav","gqurav@gmail.com");
        User u3 = new User("Ankit","ankit@gmail.com", 21);
        User u4 = new User();

        System.out.println(u1.username);
        System.out.println(u1.email);
        System.out.println(u1.age);

        System.out.println(u2.username);
        System.out.println(u2.email);
        System.out.println(u2.age);

        System.out.println(u3.username);
        System.out.println(u3.email);
        System.out.println(u3.age);

        System.out.println(u4.username);
        System.out.println(u4.email);
        System.out.println(u4.age);
    }
}