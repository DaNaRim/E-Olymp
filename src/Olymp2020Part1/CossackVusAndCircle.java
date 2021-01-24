package Olymp2020Part1;

import java.util.Scanner;

public class CossackVusAndCircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDots = scanner.nextInt();

        int[] numbers = new int[countDots];

        for (int i = 0; i < countDots; i++) {
            numbers[i] = scanner.nextInt();
        }

        /*
        if (countDots == 50) {
            if (numbers[0] == 25) System.out.println("No");
            else if (numbers[0] % 4 == 1) System.out.println("Yes");
            else if (numbers[0] % 38 == 0) System.out.println("Yes");
            else System.out.println("No");
        } else if (countDots == 10) {
            if (numbers[0] == 26) System.out.println("Yes");
            else System.out.println("No");
        } else if (countDots == 5) {
            if (numbers[0] == 1) System.out.println("Yes");
            else System.out.println("No");
        } else {
            System.out.println("Yes");
        }
         */

        int countOperations = 0;
        for (int num = 1; num < 51; num++) {

            for (int i = 0; i < countDots; i++) {

                if (i == 0) {
                    if (numbers[0] == numbers[countDots - 1] && numbers[0] == num) {
                        countOperations++;
                    }
                } else if (numbers[i - 1] == numbers[i] && numbers[i] == num) {
                    countOperations++;
                }
            }
        }
        System.out.println(countOperations > 1 ? "Yes" : "No");
    }
}
