import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    int n = j.nextInt(), k = j.nextInt(), kol = 0;
    while (n >= k)
    {
      n -= k;
      kol += 1;
    }
    System.out.println(kol + " " + n);
  }
}