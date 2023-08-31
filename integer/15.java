import java.util.Scanner;

public class helloworld {
  public static void main(String[] args){
    System.out.println("Я готов на работе");
    Scanner j = new Scanner(System.in);
    int a = j.nextInt();
    System.out.println(((a/10)%10 * 100) + (a / 100) * 10 + a % 10);
  }
}
