import java.util.Random;

public class MathProblems {
    public static int generateMathProblem() {
        Random random = new Random();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        char op = "+-*/".charAt(random.nextInt(4));
        return num1 + " " + op + " " + num2;
    }
}
