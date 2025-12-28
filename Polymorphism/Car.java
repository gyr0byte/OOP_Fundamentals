package Polymorphism;

public class Car implements Vehicle {
    @Override
    public void go() {
        System.out.println("You are driving the car.");
    }
}
