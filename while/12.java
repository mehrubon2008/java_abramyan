import java.util.Scanner;

class hello{
  public static void main(String[] args){
    System.out.println("sart");
    Scanner j = new Scanner(System.in);
    int n = j.nextInt(), i = 0, s = 0;
    
    while (s < n){
      i += 1;
      if (s + i > n){i -= 1; break;}
      s += i;
    }

    System.out.println(i);
  }
}