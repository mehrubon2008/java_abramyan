import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    //int n = in.nextInt();
    
    double[] num = new double[10];

    for (int i = 0; i < 10; i ++){
      num[i] = in.nextDouble();
    }
    System.out.println("Вышественое числа как целое числа:");
    for (int i = 0; i < 10; i ++){
      int intnum = (int) num[i];
      System.out.println(intnum);
    }
    in.close();
  }
}