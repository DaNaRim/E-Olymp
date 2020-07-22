import java.util.Scanner;

public class Problem0004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        double lengthBetweenCenters = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            System.out.println(-1);
        } else if (lengthBetweenCenters == r1 + r2 || lengthBetweenCenters + r2 == r1 || lengthBetweenCenters + r1 == r2) {
            System.out.println(1);
        } else if (lengthBetweenCenters > r1 + r2 || lengthBetweenCenters + r2 < r1 || lengthBetweenCenters + r1 < r2) {
            System.out.println(0);
        } else {
            System.out.println(2);
        }
    }
}
