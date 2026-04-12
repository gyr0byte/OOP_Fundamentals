package Deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        User user = null;
        try {
            FileInputStream fileIn = new FileInputStream("./Serialization/UserInfo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
        catch(IOException e){
            System.out.println("File I/O exception");
        }
    }
}
