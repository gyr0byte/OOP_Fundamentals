package Deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class Main {
    public static void main(String[] args) {
        User user = null;
        try {
            try (FileInputStream fileIn = new FileInputStream(
                    "./Serialization/UserInfo.ser"); ObjectInputStream in = new ObjectInputStream(fileIn) {
                        @Override
                        protected Class<?> resolveClass(ObjectStreamClass desc)
                                throws IOException, ClassNotFoundException {
                            String className = desc.getName();
                            if ("Serialization.User".equals(className) || "User".equals(className)) {
                                return User.class;
                            }
                            return super.resolveClass(desc);
                        }
                    }) {
                user = (User) in.readObject();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("File I/O exception");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!!");
        }
        if (user == null) {
            System.out.println("Deserialization failed. Run Serialization.Main to recreate UserInfo.ser.");
            return;
        }
        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
