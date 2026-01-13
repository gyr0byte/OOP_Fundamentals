package Generics;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("Banana");
        System.out.println(box.getItem());

        Product<String, Double> product = new Product<>("apple", 0.50);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());
    }
}