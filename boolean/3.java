import java.util.Scanner;

public class helloworld{
  public static void main(String[] args){
    System.out.println("Я готов на работе");
    Scanner j = new Scanner(System.in);
    long a = j.nextInt();
    System.out.println(a % 2 == 0);
  }
}
