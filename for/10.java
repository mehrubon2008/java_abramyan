import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    
    double a = j.nextDouble(), b = j.nextDouble(), s = 0;
    
    for (Double i = a; i <= b; i ++)
    {
      s += 1/i;
    }
    System.out.print(s);

  }
}