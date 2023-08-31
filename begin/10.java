import java.util.Scanner;

public class Begin{
  public static void main(String[] args){
  
    Scanner j = new Scanner(System.in);
    double a = j.nextDouble(), b = j.nextDouble();
    double sum = a + b;
    double razonst = a - b; 
    double proizvedenie = a * b;
    double chastnoe = a*a /(b * b);

    System.out.println(sum + " " + razonst + " " + proizvedenie + " " + chastnoe);
  }
}
