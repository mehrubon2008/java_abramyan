import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    
    double s = j.nextDouble();
    
    for (double i = 1; i <= 10; i ++)
    {
      System.out.print((i / 10) * s + " ");
    }

  }
}