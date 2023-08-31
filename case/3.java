import java.util.Scanner;

public class HelloWorld{
  public static void main(String[] args){
    System.out.println("start");
    
    Scanner j = new Scanner(System.in);
    int d = j.nextInt();
    if (d < 3 || d == 12){
      System.out.println("зима");
    }
    if (d < 6 && d > 2){
      System.out.println("весна");
    }
    if (d < 9 && d > 5){
      System.out.println("лето");
    }
    if (d < 12 && d > 8){
      System.out.println("Осень");
    }

  }
}