import java.util.Scanner;

public class FibonacciNumber {
  public static int findFirstFibonacci(int n) {
      int a = 1;
      int b = 1;
      int fibonacci = 0;

      while (fibonacci <= n) {
          fibonacci = a + b;
          a = b;
          b = fibonacci;
      }

      return fibonacci;
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int firstFibonacci = findFirstFibonacci(number);
      System.out.println("Первое число Фибоначчи, большее " + number + ": " + firstFibonacci);
  }
}
