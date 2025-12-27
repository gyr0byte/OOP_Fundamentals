import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {
        String[] questions = {
                "What is the main function of router?",
                "Which part of the computer is considered its brain?",
                "What year was facebook launched?",
                "Who is know as the father of computer?",
                "What was the first programming language?" };
        String[][] options = {
                { "1.Storing files", "2.Encrypting data", "3.Directing traffic", "4.Managing passwords" },
                { "1.RAM", "2.Hard Drive", "3.CPU", "4.GPU" },
                { "1.2002", "2.2004", "3.2006", "4.2008" },
                { "1.Charles Babbage", "2.Tim Berners-Lee", "3.Dennis Ritchie", "4.James Gosling" },
                { "1.FORTRAN", "2.Cobol", "3.Assembly", "4.C" } };
        int[] answers = { 3, 3, 2, 1, 1 };
        int score = 0;
        int guess;
        Scanner sc = new Scanner(System.in);
        System.out.println("*************************************");
        System.err.println("Welcome to the Java Quiz Game!");
        System.out.println("*************************************");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (1-4): ");
            guess = sc.nextInt();
            if (guess == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("*************************************");
        System.out.println("\nYour final score is: " + score + " out of " + questions.length);
        sc.close();
    }
}