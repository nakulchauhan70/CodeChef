package beginners;

import java.util.Scanner;

public class BallsAndBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            System.out.println(ballAndBoxes(sc.nextInt(), sc.nextInt()));
            testCases--;
        }
    }

    private static String ballAndBoxes(int balls, int boxes) {
        return balls >= boxes * (boxes + 1) / 2 ? "YES" : "NO";
        //n>=k*(k+1)/2
        //30,3
    }
}


