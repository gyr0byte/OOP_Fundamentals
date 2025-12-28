package Abstraction;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);

        System.out.printf("Area of Circle: %.2f\n",circle.area());
        System.out.printf("Area of Triangle: %.2f\n",triangle.area());
        System.out.printf("Area of Rectangle: %.2f\n",rectangle.area());
    }
}
