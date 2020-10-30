import java.util.Scanner;

public class Problem0020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
/*
        int result = 0;

        while (n > 0) {
            int num = n;
            int sumOfNumbers = 0;

            while (num != 0) {
                sumOfNumbers += (num % 10);
                num /= 10;
            }

            n -= sumOfNumbers;
            result++;
        }

        System.out.println(result);
        */

        int b1, b2, b3, b4, b5, b6, b7, b8, b9, b, r = 0;

        while (n > 0) {
            b9 = n % 10;
            b = b9;
            b8 = (n % 100 - b) / 10;
            b = b8 * 10 - b;
            b7 = (n % 1000 - b) / 100;
            b = b7 * 100 - b;
            b6 = (n % 10000 - b) / 1000;
            b = b6 * 1000 - b;
            b5 = (n % 100000 - b) / 10000;
            b = b5 * 10000 - b;
            b4 = (n % 1000000 - b) / 100000;
            b = b4 * 100000 - b;
            b3 = (n % 10000000 - b) / 1000000;
            b = b3 * 1000000 - b;
            b2 = (n % 100000000 - b) / 10000000;
            b1 = n / 100000000;
            n = n - (b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9);
            r++;
        }

        System.out.println(r);
    }
}