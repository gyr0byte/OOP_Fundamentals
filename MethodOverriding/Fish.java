package MethodOverriding;

public class Fish extends Animal {
    @Override
    void move() {
        System.out.println("This Fish is swimming");
    }
}
