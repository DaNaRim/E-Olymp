import java.util.Scanner;

public class Problem0003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cubes = scanner.nextInt();
        int currentCubes;
        long matches;

        int i = 0; //i = cube edge length
        while (Math.pow(i + 1, 3) <= cubes) {
            i++;
        }
        currentCubes = (int) Math.pow(i, 3);
        matches = (i + 1) * (i + 1) * i * 3;

        if (currentCubes == cubes) {
            System.out.println(matches);
            return;
        }

        int b = 0; //b = side of a square
        if (currentCubes + i * i >= cubes) {

            if (currentCubes + i * i == cubes) {
                matches += (i + 1) * (3 * i + 1); //(i + 1) * (i + 1) + i * (i + 1) * 2;
                System.out.println(matches);
                return;
            }

            matches = countMatchesOnSide(currentCubes, cubes, matches, b);
            System.out.println(matches);

        } else if (currentCubes + i * i + i * (i + 1) >= cubes) {
            currentCubes += i * i;
            matches += (i + 1) * (3 * i + 1);

            if (currentCubes + i * (i + 1) == cubes) {
                matches += 3 * i * i + 7 * i + 3; //(i + 1) * (i + 2) + i * (i + 2) + (i + 1) * (i + 1);
                System.out.println(matches);
                return;
            }

            matches = countMatchesOnSide(currentCubes, cubes, matches, b);
            System.out.println(matches);

        } else {
            currentCubes += i * (2 * i + 1); //i * i + i * (i + 1);
            matches += 6 * i * i + 11 * i + 4; //(i + 1) * (3 * i + 1) + 3 * i * i + 7 * i + 3;

            matches = countMatchesOnSide(currentCubes, cubes, matches, b);
            System.out.println(matches);
        }
    }

    private static long countMatchesOnSide(int currentCubes, int cubes, long matches, int b) {

        while (currentCubes + Math.pow(b + 1, 2) <= cubes) {
            b++;
        }
        currentCubes += b * b;
        matches += (b + 1) * (3 * b + 1); //(b + 1) * (b + 1) + b * (b + 1) * 2;

        if (currentCubes + b < cubes) {
            currentCubes += b;
            matches += (b + 1) * 2 + b; //(b + 1) + b + (b + 1)
        }

        int a; //a = bonus cubes
        if ((a = cubes - currentCubes) != 0) {
            matches += (a + 1) * 2 + a;
        }
        return matches;
    }
}
