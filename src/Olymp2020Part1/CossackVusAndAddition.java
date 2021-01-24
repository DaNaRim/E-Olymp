package Olymp2020Part1;

import java.util.Scanner;

public class CossackVusAndAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        /*
        1 - 36
        2 - 1980
        3 - 108900
        4 - 5989500
        5 - 329422500
         */

        /*
        if (n == 1) {
            System.out.println(36);
        } else if (n == 2) {
            System.out.println(1980);
        } else if (n == 3) {
            System.out.println(108900);
        } else if (n == 4) {
            System.out.println(5989500);
        } else if (n == 5) {
            System.out.println(329422500);
        }*/

        int start = 1;
        int end = 0;

        for (int i = 0; i < n; i++) {
            start *= 10;
            end = end * 10 + 9;
        }
        start /= 10;

        long result = 0;

        for (int i = start; i < end; i++) {
            for (int j = start; j < end; j++) {

                if (i + j == wrongSum(i, j)) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    public static int wrongSum(int first, int second) {
        int[] firstM = intToArray(first);
        int[] secondM = intToArray(second);

        int[] sum = new int[firstM.length];

        for (int i = 0; i < firstM.length; i++) {

            int temp = firstM[i] + secondM[i];

            sum[i] = temp > 9 ? temp - 10 : temp;
        }

        return arrayToInt(sum);
    }

    public static int[] intToArray(int num) {
        int len = getLen(num);

        if (len == 1) return new int[]{num};

        int[] arr = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }
        return arr;
    }

    public static int arrayToInt(int[] arr) {
        int result = 0;

        for (int n = arr.length - 1, i = 1; n >= 0; n--, i *= 10) {
            result += Math.abs(arr[n]) * i;
        }

        return result;
    }

    public static int getLen(int n) {
        int[] sizeTable = {9, 99, 999, 9999, 99999, 999999, 9999999,
                99999999, 999999999, Integer.MAX_VALUE};

        for (int i = 0; ; i++) if (n <= sizeTable[i]) return i + 1;
    }
}
