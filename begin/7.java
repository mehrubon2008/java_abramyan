import java.util.Scanner;

public class Begin{
  public static void main(String[] args){
  
    Scanner j = new Scanner(System.in);
    double r = j.nextInt();
    double pi = 3.14;
    double l = 2 * pi * r, s = pi * r * r;
    System.out.println(l + " " + s);
  }
}
