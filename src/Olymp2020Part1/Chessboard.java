package Olymp2020Part1;

import java.util.Scanner;

public class Chessboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] cell = scanner.next().toCharArray();
        char letter = cell[0];
        int digit = cell[1];

        boolean isEvenLetter = false;
        char[] evenLetters = {'B', 'D', 'F', 'H'};
        for (char ch : evenLetters) {
            if (letter == ch) {
                isEvenLetter = true;
                break;
            }
        }

        if (isEvenLetter && (digit & 1) == 0 || !isEvenLetter && (digit & 1) == 1) {
            System.out.println("BLACK");
        } else {
            System.out.println("WHITE");
        }
    }
}
