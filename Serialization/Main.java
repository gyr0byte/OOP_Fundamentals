import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Gaurav";
        user.password = "idkidk11";

        try {
            FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found!!");
        }
    }
}