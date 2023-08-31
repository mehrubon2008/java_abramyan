import java.util.Scanner;

class hello{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(),s, f = 0, i = 2;
    while (i <= n/2)
    {
      if (n % i == 0){f++;}
      i ++;
    }
    if (f == 0){System.out.println("True");}
    else{System.out.println("False");}
  }
}