package Olymp2020Part1;

import java.util.Scanner;

public class Journey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCities = scanner.nextInt();

        int[] citiesCoordinates = new int[countCities];

        for (int i = 0; i < countCities; i++) {
            citiesCoordinates[i] = scanner.nextInt();
        }

        int min = citiesCoordinates[0];
        int max = citiesCoordinates[0];

        for (int num : citiesCoordinates) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println((max - min) * 2);
    }
}
