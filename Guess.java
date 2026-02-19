import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // Generates a random number between 1 and 10        
        int guessNumber;

        
         do{
            System.out.print("Guess the number between 1 and 10: ");
            guessNumber = sc.nextInt();
            
         }while(guessNumber != randomNumber);
        System.out.println("Congratulations! You guessed the number."   );
        sc.close();
    }
}
