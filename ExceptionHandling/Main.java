package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("You can't divide by Zero");
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("That wasn't a number!!");
        } 
        catch (Exception e)  // Used to catch all the types of exceptions
        {
            System.out.println("Something went Wrong!");
        }
        finally{ // this always executes
        }
    }
}
