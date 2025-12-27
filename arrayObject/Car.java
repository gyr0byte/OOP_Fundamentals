package arrayObject;

public class Car {
    String model;
    String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    void drive() {
        System.out.println("The " + this.color + " " + this.model + " is driving.");
    }
}