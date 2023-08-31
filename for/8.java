import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    
    int a = j.nextInt(), b = j.nextInt(), s = 1;
    
    for (int i = a; i <= b; i ++)
    {
      s *= i;
    }
    System.out.print(s);

  }
}