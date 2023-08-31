import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    int n = j.nextInt(), kol = 0;
    
    while (n % 3 == 0)
    {
      n /= 3;
    }
    
    if (n % 3 == 1)
    {
      System.out.println("True");
    }
    else
    {
      System.out.println("False");
    }

  }
}