package AnonymousClasses;

public class Main {
    public static void main(String[] args) {
        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behavior to a class without having to create a new class.
        //                   Ofter used for one time uses (TimerTask, Runnable, callbacks)
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Malai muji nepali aaucha");
            }
        };
        dog1.speak();
        dog2.speak();
    }
}