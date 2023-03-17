package beginners;

import java.util.Scanner;

public class SavingTaxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            System.out.println(savingTaxes(sc.nextInt(), sc.nextInt()));
            testCases--;
        }
    }

    private static long savingTaxes(int x, int y) {
        return x - y;
    }
}
