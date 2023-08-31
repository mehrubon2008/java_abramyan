import java.util.Scanner;
public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    
    int a = j.nextInt(), b = j.nextInt(), n = 0;
    
    for (int i = a; i <= b; i ++){
      System.out.print(i + " ");
      n += 1;
    }
    System.out.println();
    System.out.println("n = " + n);
  }
}