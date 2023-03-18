package beginners;

import java.util.Scanner;

public class PlayPiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            System.out.println(playPiano(sc.nextLine()));
            testCases--;
        }
    }

    private static String playPiano(String s) {
        String valid = "yes";
        int day1 = 0;
        int day2 = 1;

        while (day2 < s.length()) {
            if (s.charAt(day1) == s.charAt(day2)) {
                valid = "no";
                break;
            }

            day1 += 2;
            day2 += 2;
        }

        return valid;
    }
}
