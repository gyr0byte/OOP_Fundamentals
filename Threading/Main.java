package Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have 5 seconds to enter your name");
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
            }
        }
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        sc.close();
    }
}