package beginners1star;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] input = new int[2];
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
            int noWidrl = input[0];
            int amt = input[1];
            int[] noWidrlArr = new int[noWidrl];
            for (int j = 0; j < noWidrl; j++) {
                noWidrlArr[j] = sc.nextInt();
            }
            for (int k = 0; k < noWidrl; k++) {
                if (noWidrlArr[k] <= amt) {
                    sb.append("1");
                    amt = amt - noWidrlArr[k];
                    //System.out.println("1");
                } else {
                    //System.out.println("0");
                    sb.append("0");
                }
            }
            sb.append(System.getProperty("line.separator"));
        }
        sc.close();
        System.out.println(sb);
    }
}
