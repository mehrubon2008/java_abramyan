import java.util.Scanner;

class hello{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double s = 0, p = 1;
    int n = in.nextInt();
    for (int i = 0; i < n; i ++){
      Double h = in.nextDouble();
      s += h;
      p *= h;
    }
    System.out.println("summa: "+s + " proz: " + p);
  }
}