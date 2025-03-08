import java.util.Random;

public class MathProblems {

    private Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(10) + 1;
    }
}