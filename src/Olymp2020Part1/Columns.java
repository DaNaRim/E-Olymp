package Olymp2020Part1;

import java.util.Scanner;

public class Columns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfColumns = scanner.nextInt();
        int[] heightsOfColumns = new int[numberOfColumns];

        for (int i = 0; i < numberOfColumns; i++) {
            heightsOfColumns[i] = scanner.nextInt();
        }

        int maxHeight = 0;
        for (int num : heightsOfColumns) {
            if (num > maxHeight) maxHeight = num;
        }

        System.out.println(Math.max(maxHeight, heightsOfColumns.length));
    }
}
