package Olymp2020Part2;

import java.util.Scanner;

public class KozakVusAndArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        byte[] array = new byte[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextByte();
        }

        int countSortOperations = 0;

        boolean sorted = false;
        while (!sorted) {

            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {

                    array[i] = 0;
                    array[i + 1] = 1;

                    sorted = false;
                    countSortOperations++;
                }
            }
        }
        System.out.println(countSortOperations);
    }
}
