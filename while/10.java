import java.util.Scanner;

class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    int n = j.nextInt(), k = 3, i = 0;
    
    while (k < n){
      k *= 3;
      i += 1;
    }

    System.out.println(i);
  }
}