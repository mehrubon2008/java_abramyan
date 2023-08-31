import java.util.Scanner;

class hello{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(),s;
    while (n != 0)
    {
       s = n % 10;
       System.out.print(s);
       n /= 10;
      }
  }
}