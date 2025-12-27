package Inheritance;
public class Dog extends Animal {
    int x = 4;
    public void main() {
        Dog d1 = new Dog();
        d1.eating();
        System.out.println(d1.color);
        System.out.println(super.x); // accessing parent class variable
        System.out.println(this.x);  // accessing child class variable
    }
}