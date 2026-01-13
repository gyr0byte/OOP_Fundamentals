package Generics;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("Banana");
        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("Ticket", 50);
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}