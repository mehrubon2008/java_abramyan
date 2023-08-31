import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    int a = j.nextInt(), b = j.nextInt();
    while (a > b)
    {
      a -= b;
    } 
    System.out.println(a);
  }
}