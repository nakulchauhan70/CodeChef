package beginners;

import java.util.Scanner;

public class KitchenTimetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            int students = sc.nextInt();
            int[] moments = new int[students];
            for (int i = 0; i < moments.length; i++) {
                moments[i] = sc.nextInt();
            }

            int[] timeRequired = new int[students];
            for (int i = 0; i < timeRequired.length; i++) {
                timeRequired[i] = sc.nextInt();
            }
            
            System.out.println(kitchenTimetable(moments, timeRequired));
            testCases--;
        }
    }

    private static int kitchenTimetable(int[] moments, int[] timeRequired) {
        int a = 0;
        int count = 0;

        for (int i = 0; i < moments.length; i++) {
            if (moments[i] - a >= timeRequired[i]) {
                count++;
            }

            a = moments[i];
        }

        return count;
    }
}
