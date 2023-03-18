package beginners;

import java.util.Scanner;

public class ChessMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            System.out.println(chessMatch(sc.nextInt(), sc.nextInt(), sc.nextInt()));
            testCases--;
        }
    }

    private static int chessMatch(int n, int a, int b) {
        return 2 * (180 + n) - (a + b);
    }
}
