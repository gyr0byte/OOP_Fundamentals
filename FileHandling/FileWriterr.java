package FileHandling;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterr {
    public static void main(String[] args) {
        String filePath = "FileHandling/output.txt";
        String textContent = "I like MOMO!\n It's a great Neplai dish!\n I love it.";
        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        } 
        catch(FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch (IOException e) {
            System.out.println("Couldn't write file!");
        }
    }
}