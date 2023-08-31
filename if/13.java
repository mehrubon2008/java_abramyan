import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    
    System.out.println("start");
    Scanner j = new Scanner(System.in);
    int a = j.nextInt(), b = j.nextInt(), c = j.nextInt();
    int kol = 0;
    
    if ((a <= b && b  <= c) || (c <= b && b  <= a)){
      kol += b;
    }
    if ((b <= a && a <= c) || (c <= a && a <= b) && kol == 0){
      kol += a;
    }
    if ((a <= c && c <= b ) || (b <= c && c <= a) && kol == 0){
      kol += c;
    }

    System.out.println(kol);

  
  }
}