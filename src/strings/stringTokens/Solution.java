package strings.stringTokens;
//https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        String[] answer = s.split("[\\p{P} \\t\\n\\r]+");
        if (s.length() == 0) System.out.println(0);
        else System.out.println(answer.length);
        for (String now : answer) {
            System.out.println(now);
        }
        scan.close();
    }
}
