package Olymp2020Part2;

import java.util.Arrays;
import java.util.Scanner;

public class DmitryAndBottles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int bottles = scanner.nextInt();
        final int maxVolume = scanner.nextInt();

        int[] volumeInBottles = new int[bottles];

        for (int i = 0; i < bottles; i++) {
            volumeInBottles[i] = scanner.nextInt();
        }

        int bottlesWithWaterInTheEnd = 0;
        int minLitres = 0;
        boolean hasEmptyBottles = false;

        Arrays.sort(volumeInBottles);

        int bottleIntoWhichIsPoured;
        int canAccommodate;

        outer:
        for (int i = 0; i < bottles; i++) {

            if (volumeInBottles[i] == maxVolume) {
                for (int value : volumeInBottles) {
                    if (value == 0) hasEmptyBottles = true;
                    if (value != 0) bottlesWithWaterInTheEnd++;
                }
                break;
            }

            while (volumeInBottles[i] != 0 && volumeInBottles[i + 1] != maxVolume) {
                bottleIntoWhichIsPoured = bottles - 1;

                for (int j = bottles - 1; volumeInBottles[j] == maxVolume; j--) {
                    bottleIntoWhichIsPoured--;
                }

                canAccommodate = maxVolume - volumeInBottles[bottleIntoWhichIsPoured];

                if (volumeInBottles[i] <= canAccommodate) {

                    minLitres += volumeInBottles[i];
                    volumeInBottles[bottleIntoWhichIsPoured] += volumeInBottles[i];
                    volumeInBottles[i] = 0;

                    continue outer;
                } else {

                    minLitres += canAccommodate;
                    volumeInBottles[bottleIntoWhichIsPoured] = maxVolume;
                    volumeInBottles[i] -= canAccommodate;

                }

            }
        }
        if (hasEmptyBottles) {
            System.out.println(bottlesWithWaterInTheEnd + " " + minLitres);
        } else {
            System.out.println(bottles + " " + 0);
        }
    }
}
