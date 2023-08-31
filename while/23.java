import java.util.Scanner;
public class EuclideanAlgorithm {
  public static int findGCD(int a, int b) {
      if (b == 0) {
          return a;
      } else {
          return findGCD(b, a % b);
      }
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();

      int gcd = findGCD(a, b);
      
      System.out.println("Наибольший общий делитель чисел " + a + " и " + b + ": " + gcd);
  }
}
