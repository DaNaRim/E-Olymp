import java.util.Scanner;

public class Problem0022 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = 0;

        outer:
        for (int i = a; i <= b; i++) {

            //checking for simplicity
            if (i == 1) continue; //one is not a prime number
            for (long j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }

            //find the mirror number
            int mirror = 0;
            for (int num = i; num > 0; num /= 10) {

                mirror = mirror * 10 + num % 10;
            }

            //checking mirror for simplicity
            for (long j = 2; j < mirror; j++) {
                if (mirror % j == 0) {
                    continue outer;
                }
            }
            result++;
        }

        System.out.println(result);
    }
}