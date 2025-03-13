import java.util.Random;

public class MathProblem {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int c = rand.nextInt(10);
        int d = rand.nextInt(10);
        System.out.println("What is " + a + "x" + b + "x" + c + "x" + d + "?");
    }
}
