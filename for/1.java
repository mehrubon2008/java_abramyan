import java.util.Scanner;
public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    
    int k = j.nextInt(), n = j.nextInt();
    
    for (int i = 0; i < n; i ++){
      System.out.print(k + " ");
    }
  }
}