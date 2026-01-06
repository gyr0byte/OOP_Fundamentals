package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterr {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("output.txt")) {
            writer.write("I like MOMO!");
        } 
        catch (IOException e) {
            System.out.println("Couldn't write file!");
        }
    }
}