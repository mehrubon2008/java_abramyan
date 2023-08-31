import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    int n = j.nextInt(), kol = 0;
    
    while (n % 2 != 1)
    {
      n /= 2;
      kol ++;
    }
    
      System.out.println(kol);

  }
}