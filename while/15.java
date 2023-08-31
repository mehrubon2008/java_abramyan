import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      double deposit = 1000;
        double p = in.nextDouble(); 
        
        int months = 0; 
        
        while (deposit < 1100) {
            deposit += deposit * p;
            months++; 

        }

        System.out.println("Количество месяцев: " + months);
        System.out.println("Итоговый размер вклада: " + deposit);
    }
}