
import java.util.ArrayList;
import java.util.Scanner;


public class HangManGame {
    public static void main(String[] args) {
        String word = "Apple";
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        } 
    }
}