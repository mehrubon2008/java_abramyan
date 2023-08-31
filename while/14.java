import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int a = input.nextInt();
        int k = 1;
        double sum = 1;
        while (sum < a) {
            k++;
            sum += 1.0 / k;
        }
        System.out.println("Наибольшее значение K: " + (k - 1));
        System.out.println("Сумма: " + sum);
    }
}
