import java.util.Scanner;

class hello{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double s = 0;
    for (int i = 0; i < 10; i ++){
      Double h = in.nextInt();
      s += h;
    }
    System.out.println(s/10);
  }
}