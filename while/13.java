import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int k = 1;
        double sum = 1;

        while (sum <= a) {
            k++;
            sum += 1.0 / k;
        }
        
        System.out.println("Наименьшее число K: " + k);
        System.out.println("Сумма: " + sum);
    }
}
