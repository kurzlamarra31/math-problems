public class MathProblems {
    public static void main(String[] args) {
        // Example problem 1: Calculate the sum of two numbers
        int num1 = 5;
        int num2 = 3;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));

        // Example problem 2: Find the factorial of a number
        int number = 4;
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);

        // Example problem 3: Calculate the product of two numbers
        double num1 = 7.5;
        double num2 = 2.0;
        System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
    }

    // Helper method to calculate factorial
    public static long factorial(int number) {
        if (number == 0 || number == 1) return 1;
        else return (number * factorial(number - 1));
    }
}
