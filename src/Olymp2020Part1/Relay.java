package Olymp2020Part1;

import java.util.Scanner;

public class Relay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMembers = scanner.nextInt();
        int boys = 0, girls = 0;

        for (int i = 0; i < numberOfMembers; i++) {
            if (scanner.nextInt() == 1) boys++;
            else girls++;
        }

        System.out.println(Math.min(boys, girls));
    }
}
