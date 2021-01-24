package Olymp2020Part1;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (x1 < x2) {
            System.out.printf("%d %d %d %d%n", x1, y2, x2, y1);
        } else {
            System.out.printf("%d %d %d %d%n", x2, y1, x1, y2);
        }
    }
}
