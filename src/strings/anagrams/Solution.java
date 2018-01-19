package strings.anagrams;
//https://www.hackerrank.com/challenges/java-anagrams/problem

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        StringBuilder sba = new StringBuilder(a.toLowerCase());
        StringBuilder sbb = new StringBuilder(b.toLowerCase());
        for (int i = 0; i < sba.length(); i++) {
            String temp = sba.substring(i, i + 1);
            if (sbb.indexOf(temp) == -1) return false;
            sbb.deleteCharAt(sbb.indexOf(temp));
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}


