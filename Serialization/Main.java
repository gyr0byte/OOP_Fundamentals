
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Gaurav";
        user.password = "idkidk11";

        try {
            FileOutputStream fileOut = new FileOutputStream("./Serialization/UserInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            System.out.println("Object Info Saved!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("File not found!!");
        }
    }
}