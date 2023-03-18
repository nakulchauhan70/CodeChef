package beginners1star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EasyPronunciation {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int testCases = fr.nextInt();

        while (testCases > 0) {
            System.out.println(easyPronunciation(fr.nextInt(), fr.next()));
            testCases--;
        }
    }

    private static String easyPronunciation(int x, String s) {
        String easyPronunciation = "YES";

        if (x < 4) {
            return easyPronunciation;
        }

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (count == 4) {
                easyPronunciation = "NO";
                break;
            }

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count = 0;
            } else {
                count++;
            }
        }

        return easyPronunciation;
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

//        import java.util.*;
//        import java.lang.*;
//        import java.io.*;
//class Codechef{
//    public static void main (String[] args) throws java.lang.Exception{
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0){
//            int n=sc.nextInt();     //size of string
//            sc.nextLine();
//            String s=sc.next();     //string input
//            s.toLowerCase();
//            if(n<4){ System.out.println("YES"); }
//            else{
//                int count=0;
//                for(int i=0; i<s.length(); i++){
//                    if(count==4){ break; }
//                    if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
//                    { count=0; }
//                    else { count++; }
//                }
//                if(count==4){ System.out.println("NO"); }
//                else{ System.out.println("YES"); }
//            }
//        }
//    }
//}

