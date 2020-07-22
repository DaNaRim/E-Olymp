import java.util.Scanner;

public class Problem0010 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int trees = scanner.nextInt();
        int days = 0;

        double waterPerTree = 0;
        while (waterPerTree <= 0.5) {
            waterPerTree += (double) 1 / (trees - days++);
        }
        int wateringStartDay = trees - days + 1;

        System.out.println(wateringStartDay);
    }
}
