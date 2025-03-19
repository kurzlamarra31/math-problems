  import java.util.Random;
  
public class MathProblem {
  private final Random rand = new Random();
  
  public int getNextProblem() {
    // Generate a random number between 1 and 10
    int num1 = rand.nextInt(10) + 1;
    int num2 = rand.nextInt(10) + 1;
    
    // Calculate the sum of the two numbers
    int sum = num1 + num2;
    
    // Return the problem and the correct answer
    return new MathProblem(num1, num2, sum);
  }
  
  public static void main(String[] args) {
    MathProblem problem = new MathProblem();
    System.out.println(problem.getNextProblem());
  }
}