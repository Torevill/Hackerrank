package strings.introduction;
//https://www.hackerrank.com/challenges/java-strings-introduction/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length()+B.length());
        String answer = A.compareToIgnoreCase(B)>0 ? "Yes": "No";
        System.out.println(answer);
        A = A.substring(0,1).toUpperCase()+A.substring(1);
        B = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(A + " " + B);

        sc.close();
    }
}
