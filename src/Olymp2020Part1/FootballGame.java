package Olymp2020Part1;

import java.util.Scanner;

public class FootballGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ukrInUkr = scanner.nextInt();
        int potInUkr = scanner.nextInt();
        int potInPot = scanner.nextInt();
        int ukrInPot = scanner.nextInt();

        if (ukrInUkr + ukrInPot > potInPot + potInUkr) {
            System.out.println("U");
        } else if (ukrInUkr + ukrInPot < potInPot + potInUkr) {
            System.out.println("P");
        } else if (ukrInPot > potInUkr) {
            System.out.println("U");
        } else if (ukrInPot < potInUkr) {
            System.out.println("P");
        } else {
            System.out.println("T");
        }
    }
}
