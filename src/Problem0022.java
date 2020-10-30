import java.util.Scanner;

public class Problem0022 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = 0;

        outer:
        for (int i = a; i <= b; i++) {

            //перевірка на простоту
            if (i == 1) continue; //одиниця не просте число
            for (long j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }

            //знаходимо дзеркальне
            int mirror = 0;
            for (int num = i; num > 0; num /= 10) {

                mirror = mirror * 10 + num % 10;
            }

            //перевірка на простоту
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