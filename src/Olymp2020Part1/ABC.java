package Olymp2020Part1;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b + c || b == c + a || c == a + b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
