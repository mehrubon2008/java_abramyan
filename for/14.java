import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    
    double n = j.nextDouble(), t = 0, f = 1;
    for (double i = 11; i <= n; i ++)
    {
      t += (i / 10) * f;
  
      f *= -1;
    }
    System.out.print(f);

  }
}