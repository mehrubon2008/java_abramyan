import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    int n = j.nextInt(), kol = 0, i = 2;
    while (i * i <= n)
    {
      i ++;
    }
    System.out.println(i);

  }
}