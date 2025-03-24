import java.util.Scanner;

public class MathProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.print("What is the area of a square with side length " + (double) scanner.nextDouble() + ": ");
        double squareArea = scanner.nextDouble();
        
        System.out.println(name + "'s area is: " + squareArea);
    }
}
