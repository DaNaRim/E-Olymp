import java.util.Scanner;

public class Problem0001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String result = num / 10 + " " + num % 10;
        System.out.println(result);
    }
}
