import java.util.Scanner;

public class HelloWorld{
  public static void main(String[] args){
    
    System.out.println("start");
    
    Scanner j = new Scanner(System.in);
    int d = j.nextInt();
    String s;
    
    switch (d){
      case 1:
       s = "плохо";
       break;
      case 2:
       s = "неудотворительно";
       break;
      case 3:
       s = "удотворительно";
       break;
      case 4:
       s = "хорошо";
       break;
      case 5:
       s = "отлично";
       break;
      default:
        s = "Error";  
    }
    
    System.out.println("оценка: " + s);
  }
}