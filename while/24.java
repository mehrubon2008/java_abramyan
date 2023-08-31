import java.util.Scanner;

public class FibonacciCheck {
  public static boolean isFibonacci(int n) {
      if (n == 0 || n == 1) {
          return true;
      }

      int a = 1;
      int b = 1;
      int fibonacci = 0;

      while (fibonacci < n) {
          fibonacci = a + b;
          a = b;
          b = fibonacci;
      }

      return fibonacci == n;
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();  
      boolean isFibonacci = isFibonacci(number);
      System.out.println(number + " является числом Фибоначчи: " + isFibonacci);
  }
}
