package Olymp2020Part2;

import java.util.Scanner;

public class CossackMustacheAndStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lines = scanner.nextLine();

        int countSubLines = 0;

        String line;

        for (int startIndex = 0; startIndex < lines.length(); startIndex++) {

            outer:
            for (int endIndex = startIndex + 3; endIndex <= lines.length(); endIndex++) {

                line = lines.substring(startIndex, endIndex);

                Character firstType = null;
                Character secondType = null;
                int countFirstType = 0;
                int countSecondType = 0;
                for (char ch : line.toCharArray()) {

                    if (firstType == null) {
                        firstType = ch;
                        countFirstType++;
                    } else if (ch != firstType && secondType == null) {
                        secondType = ch;
                        countSecondType++;
                    } else if (ch != firstType && ch != secondType) {
                        continue outer;
                    } else if (ch == firstType) {
                        countFirstType++;
                    } else {
                        countSecondType++;
                    }
                }

                if (countFirstType == 1 || countSecondType == 1) {
                    countSubLines++;
                }
            }
        }
        System.out.println(countSubLines);
    }
}
