package arrayObject;
public class Main {
    public static void main(String[] args) {
      /*Car car1 = new Car("Toyota", "Red");
        Car car2 = new Car("Honda", "Blue");    
        Car car3 = new Car("Ford", "Black"); */
        Car[] cars = {
            new Car("Toyota", "Red"),
            new Car("Honda", "Blue"),
            new Car("Ford", "Black")
        };
        for (Car car : cars) {
            car.drive();
        }
    }
}