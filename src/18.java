public class MathProblems {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int x = 5;
        double y = 3.14;
        float z = 2.7f;
        boolean result = true;

        if (x > 0 && y + y < z / 2) {
            System.out.println("The function returned 'true'");
        } else {
            System.out.println("The function returned 'false'");
        }

        // Example: Calculate the area of a circle
        double radius = 7;
        double area = Math.PI * (radius * radius);
        System.out.println("The area of the circle is " + area);

        // Example: Add two numbers without using arithmetic operators
        int num1 = 20;
        int num2 = 5;
        int sum = num1 + num2; // This will result in 25
    }
}
