import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        Random random = new Random();
       
        int numberToGuess = random.nextInt(100) + 1;
        
        int userGuess = 0;
        int steps = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            steps++;
            
            if (userGuess < numberToGuess) {
                System.out.println(" Try Larger  Number.");
            } else if (userGuess > numberToGuess) {
                System.out.println(" Try Smaller Number .");
            } else {
                System.out.println("Congratulations! You've win  the game.");
                System.out.println("Completed in  " + steps + " steps.");
            }
        }
    
        scanner.close();
    }
}
