import java.util.Scanner;

public class Begin{
  public static void main(String[] args){
  
    Scanner j = new Scanner(System.in);
    double a = j.nextInt(), b = j.nextInt(), c = j.nextInt();
    double v = a * b * c, s = 2 * (a * b + b * c + a * c);
    System.out.println(v + " " + c);
  }
}
