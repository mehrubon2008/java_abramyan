import java.util.Scanner;

class hello{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), kol = 0;
    while (n != 0)
    {
       n /= 10;
       kol ++;
      }
      System.out.print(kol + " ");
  }
}