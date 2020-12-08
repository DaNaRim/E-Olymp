import java.util.Scanner;

public class Problem0014 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int passengers = scanner.nextInt();
        int ticket = scanner.nextInt();

        int passengerShift = 0;

        outer:
        for (int t = ticket + 1; t < passengers + ticket; t++) {

            //checking for simplicity
            for (int i = 2; i < t; i++) {

                if (t % i == 0) {
                    passengerShift++;
                    continue outer;
                }
            }
            break;
        }

        if (passengerShift + 1 == passengers) {
            System.out.println(-1);
        } else {
            System.out.println(passengerShift);
        }
    }
}
