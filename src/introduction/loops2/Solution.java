package introduction.loops2;
//https://www.hackerrank.com/challenges/java-loops/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh) {
        int x = 0;

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int answ = a + b;
            System.out.print(answ);
            for (int j = 1; j < n; j++) {
                answ = answ + (int) Math.pow((double) 2, (double) j) * b;
                System.out.print(" " + answ);
            }
            System.out.println();
        }
        in.close();


    }
}
