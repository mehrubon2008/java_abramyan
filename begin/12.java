import java.util.Scanner;

public class Begin{
  public static void main(String[] args){
  
    Scanner j = new Scanner(System.in);
    int a = j.nextInt(), b = j.nextInt();
    double c = Math.sqrt((a * a) - (b * b));
    double p = a+b+c;
    System.out.println(c + "  " + p);
  
  }
}
