import java.util.Scanner;

public class main{
  public static void main(String[] args){
    
    System.out.println("start");
    
    Scanner j = new Scanner(System.in);
    int d = j.nextInt();
    String s;
    
    switch (d){
      case 1:
       s = "понедельник";
       break;
      case 2:
       s = "вторник";
       break;
      case 3:
       s = "среда";
       break;
      case 4:
       s = "пятнадцать";
       break;
      case 5:
       s = "суббота";
       break;
      case 7:
       s = "воскрасний";
       break;
      default:
        s = "Error";  
    }
    
    System.out.println("название дня недели: " + s);
  }
}