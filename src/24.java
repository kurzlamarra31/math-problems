import org.javatuples.Pair;

public class MathProblems {
    public static void main(String[] args) {
        // Example Java program that demonstrates basic operations and conditional statements

        Pair<Integer, Integer> result = Pair.with(2, 3).multiply(4).divide(5);
        System.out.println("Result: " + result.get());

        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }
}
