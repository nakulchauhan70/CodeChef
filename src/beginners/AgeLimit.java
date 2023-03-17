package beginners;

import java.util.Scanner;

public class AgeLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            System.out.println(ageLimit(sc.nextInt(), sc.nextInt(), sc.nextInt()));
            testCases--;
        }
    }

    private static String ageLimit(int x, int y, int a) {
        return a >= x && a < y ? "YES" : "NO";
    }
}
