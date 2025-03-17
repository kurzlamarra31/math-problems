  package mathProblems;

import java.util.Random;

public class MathProblem {
    private Random rand = new Random();

    public int generateNumber(int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }
}