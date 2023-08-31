import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    
    double n = j.nextDouble(), s = 0;
    
    for (int i = 0; i <= n; i ++)
    {
      s += (n + i) * (n + i);
    }
    System.out.print(s);

  }
}