package beginners;

import java.util.Scanner;

public class TheLeadGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        int max = 0;
        int p1 = 0;
        int p2 = 0;

        while (testCases > 0) {
            p1 += sc.nextInt();
            p2 += sc.nextInt();

            int lead = p1 - p2;
            if (Math.abs(lead) > Math.abs(max)) {
                max = lead;
            }
            testCases--;
        }

        if (max > 0) {
            System.out.println(1 + " " + max);
        } else {
            System.out.println(2 + " " + Math.abs(max));
        }
    }
}
