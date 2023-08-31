import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    
    System.out.println("start");
    Scanner j = new Scanner(System.in);
    int a = j.nextInt(), b = j.nextInt();
    int kol = a;
    
    if (a > b){
      a = b;
      b = kol;
    }
    System.out.println(a + " " +b);
  
  }
}