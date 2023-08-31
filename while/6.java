import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    int n = j.nextInt(), kol = 0, f = n, flag = 1, i = 2;
    if (n % 2 == 0){
      flag ++;
      //f++;
    }

    while (n - i != flag)
    {
      f *= (n - i);
      i += 2;
    }
    if (n % 2 == 0){f*= 2;}
    System.out.println(f);

  }
}