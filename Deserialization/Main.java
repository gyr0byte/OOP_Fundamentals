package Deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        User user = null;
        try {
            try (FileInputStream fileIn = new FileInputStream(
                    "C:\\Users\\MSI\\Desktop\\College codes\\sem_1\\Programming_Java\\OOP\\Serialization\\UserInfo.ser"); ObjectInputStream in = new ObjectInputStream(fileIn)) {
                user = (User) in.readObject();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("File I/O exception");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!!");
        }
        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
