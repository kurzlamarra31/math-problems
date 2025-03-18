public class MathProblems {
    public static int solveMathProblem(int num1, int num2) {
        // Generate a random math problem here and solve it using the given numbers
        int problem = (int)(Math.random() * 10);
        switch (problem) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                return num1 / num2;
            default:
                // This should never happen, but we need to handle it anyway
                return 0;
        }
    }
}