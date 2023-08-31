import java.util.Scanner;
public class Begin{
  public static void main(String[] args){
  
    Scanner v = new Scanner(System.in);
    double a = v.nextDouble();
    double b = v.nextDouble();
    
    Double s;
    Double p;
    
    s = a*b;
    p = 2*(a+b);

    System.out.println(s + " "+ p);
  
  }
  
}
