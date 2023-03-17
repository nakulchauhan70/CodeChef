package beginners;

import java.util.Scanner;

public class GoodTurn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            System.out.println(goodTurn(sc.nextInt(), sc.nextInt()));
            testCases--;
        }
    }

    private static String goodTurn(int a, int b) {
        return a + b > 6 ? "YES" : "NO";
    }
}
