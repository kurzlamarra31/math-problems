import java.util.Random;

public class MathProblem {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        String operator = null;
        switch (rand.nextInt(4)) {
            case 0:
                operator = "+";
                break;
            case 1:
                operator = "-";
                break;
            case 2:
                operator = "*";
                break;
            case 3:
                operator = "/";
                break;
        }
        System.out.println(a + " " + operator + " " + b);
    }
}
