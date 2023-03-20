package beginners;

import java.util.Scanner;

public class ChefPlaysLudo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            System.out.println(ludo(sc.nextInt()));
            testCases--;
        }
    }

    private static String ludo(int n) {
        return n == 6 ? "YES" : "NO";
    }
}
