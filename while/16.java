import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();
        double distance = 10.0;
        int days = 1;
        double totalDistance = 10.0;

        while (totalDistance <= 200.0) {
            distance *= (1.0 + p / 100.0);
            totalDistance += distance;
            days++;
        }

        System.out.println("Days: " + days);
        System.out.println("Total distance: " + totalDistance);
    }
}
