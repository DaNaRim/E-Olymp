package Olymp2020Part2;

import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        int countOperations = 0;

        while (n != 1) {
            if (n % 3 == 0) {
                n = n / 3 + n % 3;
                countOperations++;
            } else if ((n + 1) % 3 == 0 && n != 2) {
                n++;
                n = n / 3 + n % 3;
                countOperations += 2;
            } else {
                n--;
                countOperations++;
            }
        }
        System.out.println(countOperations);
    }
}
