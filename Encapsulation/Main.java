package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Red", 30000);
        car.setColor("Black");
        car.setPrice(15000);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
