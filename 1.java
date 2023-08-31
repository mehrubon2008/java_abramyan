import java.util.Scanner;

public class hello{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), kol = 0;
    for (int i = 0; i < n; i ++){
      int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), s = 0;
      if (a < c){s ++;}
      if (a < b){s ++;}
      if (a < d){s ++;}
      System.out.println(s);
    }
  }
}