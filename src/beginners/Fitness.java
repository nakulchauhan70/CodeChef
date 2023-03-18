package beginners;

import java.util.Scanner;

public class Fitness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            System.out.println(fitness(sc.nextInt()));
            testCases--;
        }
    }

    private static long fitness(int x) {
        return x * 2 * 5;
    }
}
