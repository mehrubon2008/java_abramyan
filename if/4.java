import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    
    System.out.println("start");
    Scanner j = new Scanner(System.in);
    int a = j.nextInt(), b = j.nextInt(), c = j.nextInt();
    int kol = 0;

    if (a > 0){kol += 1;}
    if (b > 0){kol += 1;}
    if (c > 0){kol += 1;}

    System.out.println(kol);
  }
}