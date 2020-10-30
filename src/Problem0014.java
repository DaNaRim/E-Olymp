import java.util.Scanner;

public class Problem0014 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int passengers = scanner.nextInt();
        int ticket = scanner.nextInt();

        int result = 0;
        int v = 0;
        int g = 0;

        for (int t = ticket + 1; t <= passengers + ticket; t++) {
            for (int j = 2; j <= t; j++) {
                if (t == j && g == 0) {
                    v = j;
                    break;
                }
                if (t % j == 0 && g != 1) {
                    result++;
                    g++;
                }
            }
            g = 0;
            if (t == v) {
                break;
            }
        }
        if (result >= passengers - 1) {
            result = -1;
        }
        System.out.println(result);
    }
}
