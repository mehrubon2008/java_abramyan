import java.util.Scanner;

public class Begin{
  public static void main(String[] args){
  
    Scanner j = new Scanner(System.in);
    int a = j.nextInt(), b = j.nextInt();
    int sum = a + b;
    int razonst = (a - b); 
    int proizvedenie = a * b;
    int moda =Math.abs(a);
    int modb = Math.abs(b);
    int s = moda / modb;
    System.out.println(sum + " " + razonst + " " + proizvedenie + " " + s);
  
  }
}
