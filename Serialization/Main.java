import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Gaurav";
        user.password = "idkidk11";

        try {
            FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
        } 
        catch (IOException e) {
            System.out.println("File not found!!");
        }
    }
}