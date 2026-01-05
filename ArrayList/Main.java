package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        list.add(3);
        list.add(12);
        list.add(7);
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Coconut");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.remove(3);
        fruits.set(1,"Pineapple");
        System.out.println(list);
        System.out.println(fruits);
        System.out.println(fruits.get(1));
        Collections.sort(fruits); // Sorts in ascending order
        System.out.println(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}