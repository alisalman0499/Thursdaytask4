import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	    System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
	// Create a Scanner object
        Scanner in = new Scanner(System.in);
        /*
        Sjov bug sker hvis man bruger scanner for hasNextDouble, scanner tager det lokale sprog som udgangspunkt
        så man kan altså ikke bruge . for sine double tal som på engelsk hvis pc'en er på dansk.
        Man kan tvinge Java til at tage engelske værdier ved at gøre brug af:
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        */
        // use hasNextDouble to check if input is numeric, 
        if (!in.hasNextDouble()){ //if betingelse fra ThinkJava Kapitel 5.10
            String word = in.next();
            System.err.printf("I didnt know %s was a number :)), try again and maybe type a number this time", word);
            return;
        }
        // if so...
        int userNumber = (int) in.nextDouble();
	// Read user input
        // Compare it with the random number
        // Let the user know the result of the comparison
        // Let the user try again by calling this method recursively
        // Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively
    }
}