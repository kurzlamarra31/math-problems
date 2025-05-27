import java.util.Random;

public class MathProblems {
    public static void main(String[] args) {
        Random rand = new Random();
        
        // Generate a random number between 1 and 10
        int randomNumber = rand.nextInt(10) + 1;
        
        System.out.println("Random Number: " + randomNumber);
        
        // If the generated number is even, increment it by 2
        if (randomNumber % 2 == 0) {
            randomNumber += 2;
        }
        
        System.out.println("Even Incremented: " + randomNumber);
    }
}
