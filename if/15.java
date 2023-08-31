import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    
    System.out.println("start");
    Scanner j = new Scanner(System.in);
    int a = j.nextInt(), b = j.nextInt(), c = j.nextInt();
    int kol = 0, kol2 = 0;

    if ((a <= b && b  <= c) || (c <= b && b  <= a)){
      kol += b;
    }
    if ((b <= a && a <= c) || (c <= a && a <= b) && kol == 0){
      kol += a;
    }
    if ((a <= c && c <= b ) || (b <= c && c <= a) && kol == 0){
      kol += c;
    }


    if (a <= b && b >= c){
      kol2 += b;
    }
    if (b <= a && a >= c && kol2 == 0){
      kol2 += a;
    }
    if (a <= c && c >= b && kol2 == 0){
      kol2 += c;
    }


    System.out.println(kol + kol2);

  
  }
}