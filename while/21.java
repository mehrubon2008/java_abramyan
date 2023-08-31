import java.util.Scanner;

class hello{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(),s, f = 0;
    while (n != 0)
    {
       s = n % 10;
       if (s %2 == 1){System.out.print("True");f = 1;break;}
       n /= 10;
    }
    
    if (f == 0){System.out.println("False");}

  }
}