package beginners;

import java.util.Scanner;

public class HowManyUnattemptedProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(unattemptedProblems(sc.nextInt(), sc.nextInt()));
    }

    private static int unattemptedProblems(int x, int y) {
        return x - y;
    }
}
