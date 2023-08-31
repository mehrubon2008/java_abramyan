import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    
    double n = j.nextDouble(), s = 1;
    int kol = 0;
    for (double i = 11; true; i ++)
    {
      kol ++;
      s *= i / 10;
      if (n == kol){break;}
    }
    System.out.print(s);

  }
}