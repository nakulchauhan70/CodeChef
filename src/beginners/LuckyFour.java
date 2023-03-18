package beginners;

import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            System.out.println(luckyFour(sc.nextLine()));
            testCases--;
        }
    }

    private static long luckyFour(String s) {
        return s.chars().filter(c -> c == '4').count();
    }
}

