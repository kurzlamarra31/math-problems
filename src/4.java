import java.util.Random;

class MathProblem {
    public int getRandomProblem() {
        Random rand = new Random();
        int a = rand.nextInt(10) + 1;
        int b = rand.nextInt(10) + 1;
        return a * b;
    }
}
