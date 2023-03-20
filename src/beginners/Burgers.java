package beginners;

import java.util.Scanner;

public class Burgers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            System.out.println(burger(sc.nextInt(), sc.nextInt()));
            testCases--;
        }
    }

    private static int burger(int a, int b) {
        return a < b ? a : b;
    }
}
