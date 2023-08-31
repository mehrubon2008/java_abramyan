import java.util.Scanner;
public class hello{
  public static void main(String[] args){
    System.out.println("start");
    Scanner j = new Scanner(System.in);
    int a = j.nextInt();
    if (a > 0){a += 1;}
    System.out.println(a);
  }
}