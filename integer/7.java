import java.util.Scanner;

public class Intger{
  public static void main(String[] args){
    System.out.println("Я готов на работе");
    Scanner j = new Scanner(System.in);
    int a = j.nextInt();
    System.out.println(a/10+a%10 + " " + a/10*a%10);
  }
}
