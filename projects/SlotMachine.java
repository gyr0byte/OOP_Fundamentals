import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 100, bet, payout;
        String playAgain;
        String[] row;
        System.out.println("Welcome to the java slot machine!");
        System.out.println("Symbols: 🍒🍉🍋🔔⭐");
        System.out.println("==============================");
        while (balance > 0){
            System.out.println("Current balance: Rs" + balance);
            System.out.print("Enter your bet amount:");
            bet = sc.nextInt();
            sc.nextLine(); // consume newline
            if (bet > balance) {
                System.out.println("Insufficient balance. Please enter a valid bet amount.");
                continue;
            }
            else if (bet <= 0) {
                System.out.println("Bet amount must be greater than zero.");
                continue;
            }
            else{
                balance -= bet;
            }
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            getPayout(row, bet);
            payout = getPayout(row, bet);
            if (payout > 0){
                System.out.println("Congratulations! You won Rs" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry, you lost this round.");
            }
            System.out.println("Do you want to play again? (Y/N)");
            playAgain = sc.nextLine();
            if (!playAgain.equalsIgnoreCase("Y")){
                break;
            }
        }
        System.out.println("Thank you for playing! Your final balance is Rs" + balance);
        sc.close();
   }
   static String[] spinRow(){
       String [] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
       String [] row = new String[3];
       Random rand = new Random();
       for (int i = 0; i < 3; i++) {
           row[i] = symbols[rand.nextInt(symbols.length)];
       }
       return row;
   }
   static void printRow(String[] row){
       System.out.println("==============================");
       System.out.println(" "+ String.join(" | ", row) + " ");
       System.out.println("==============================");
   }
   static int getPayout(String[] row, int bet){
       if (row[0].equals(row[1]) && row[1].equals(row[2])) {
           return switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
           };
       }
       else if (row[0].equals(row[1])) {
           return switch (row[0]){
               case "🍒" -> bet * 2;
               case "🍉" -> bet * 3;
               case "🍋" -> bet * 4;
               case "🔔" -> bet * 5;
               case "⭐" -> bet * 10;
               default -> 0;
           };
       }
       else if (row[1].equals(row[2])) {
           return switch (row[1]){
               case "🍒" -> bet * 2;
               case "🍉" -> bet * 3;
               case "🍋" -> bet * 4;
               case "🔔" -> bet * 5;
               case "⭐" -> bet * 10;
               default -> 0;
           };
       }
        return 0;
   }
}