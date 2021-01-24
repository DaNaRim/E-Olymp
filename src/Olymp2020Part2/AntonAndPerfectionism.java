package Olymp2020Part2;

import java.util.Arrays;
import java.util.Scanner;

public class AntonAndPerfectionism {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraysLength = scanner.nextInt();
        int[] firstArray = new int[arraysLength];
        int[] secondArray = new int[arraysLength];

        for (int i = 0; i < arraysLength; i++) {
            firstArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraysLength; i++) {
            secondArray[i] = scanner.nextInt();
        }

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        int nextMiddle = arraysLength / 2 + 1;

        boolean isContinue = false;
        for (int i = 0; i < arraysLength; i++) {

            if (isContinue) {
                isContinue = false;
                continue;
            }

            if (firstArray[arraysLength - 1 - i] == secondArray[i]) {
                System.out.println(firstArray[arraysLength - 2 - i] + " " + secondArray[i]);
                System.out.println(firstArray[arraysLength - 1 - i] + " " + secondArray[i + 1]);

                isContinue = true;
            } else {
                System.out.println(firstArray[arraysLength - 1 - i] + " " + secondArray[nextMiddle + i]);
            }


//            if (firstArray[i] < secondArray[arraysLength - 1 - i]) {
//                System.out.println(firstArray[i] + " " + secondArray[arraysLength - 1 - i]);
//            }
        }
    }
}
