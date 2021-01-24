package Olymp2020Part1;

import java.util.Scanner;

public class WhoHasTheHighestScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int petrykMark = scanner.nextInt();
        int marichkaMark = scanner.nextInt();
        int olenkaMark = scanner.nextInt();

        if (petrykMark > marichkaMark && petrykMark > olenkaMark) {
            System.out.println("Petryk");
        } else if (marichkaMark > petrykMark && marichkaMark > olenkaMark) {
            System.out.println("Marichka");
        } else {
            System.out.println("Olenka");
        }
    }
}
