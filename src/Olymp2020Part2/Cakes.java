package Olymp2020Part2;

import java.util.Scanner;

public class Cakes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long cakesToBy = scanner.nextLong();
        long moneyForDiscount = scanner.nextLong();

        long moneyToPay = 0;

        long cakes = cakesToBy;
        while (moneyForDiscount + 1 <= cakes) {
            moneyToPay += moneyForDiscount;

            cakes -= (moneyForDiscount + 1);
        }
        if (cakes != 0) {
            moneyToPay += cakes;
        }

        System.out.println(moneyToPay);
    }
}
