package AnonymousClasses;

public class Main {
    public static void main(String[] args) {
        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behavior to a class without having to create a new class.
        //                   Ofter used for one time uses (TimerTask, Runnable, callbacks)
        Dog dog = new Dog();

        dog.speak();
    }
}