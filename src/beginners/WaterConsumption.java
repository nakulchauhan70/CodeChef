package beginners;

import java.util.Scanner;

public class WaterConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            System.out.println(waterConsumption(sc.nextInt()));
            testCases--;
        }
    }

    private static String waterConsumption(int x) {
        return x >= 2000 ? "YES" : "NO";
    }


}
