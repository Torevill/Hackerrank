package strings.substringComparisons;
//https://www.hackerrank.com/challenges/java-string-compare/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 0; i < s.length() - k + 1; i++) {
            smallest = smallest.compareTo(s.substring(i, i + k)) > 0 ? s.substring(i, i + k) : smallest;
            largest = largest.compareTo(s.substring(i, i + k)) < 0 ? s.substring(i, i + k) : largest;
        }


        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}