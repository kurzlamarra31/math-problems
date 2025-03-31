public class MathProblems {
    public static void main(String[] args) {
        // Example 1: Simple arithmetic operations
        int result1 = 5 + 3;
        System.out.println("The result of 5 + 3 is: " + result1);

        // Example 2: Using loops to iterate over numbers
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Example 3: Creating a method to calculate the area of a rectangle
        double base = 10;
        double height = 5;
        double area = base * height;
        System.out.println("The area of the rectangle is: " + area);

        // Example 4: Using if-else statements with multiple conditions
        String message = "Hello, world!";
        if (message.startsWith("Hello")) {
            System.out.println("Message starts with 'Hello'");
        } else if (message.endsWith("!")) {
            System.out.println("Message ends with '.'");
        } else {
            System.out.println("Message does not match any of the specified conditions");
        }

        // Example 5: Generating a random number between 1 and 10
        int randomNumber = (int) Math.random() * 10 + 1;
        System.out.println("Random number generated: " + randomNumber);
    }
}
