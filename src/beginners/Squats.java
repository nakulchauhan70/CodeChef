package beginners;

import java.util.Scanner;

public class Squats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            System.out.println(squats(sc.nextInt()));
            testCases--;
        }
    }

    private static long squats(int x) {
        return x * 15;
    }
}
