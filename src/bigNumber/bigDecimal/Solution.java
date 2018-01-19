package bigNumber.bigDecimal;
//https://www.hackerrank.com/challenges/java-bigdecimal/problem

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        String[] temp = new String[n];
        for (int i = 0, j = 0; i < s.length; i++) {
            if (s[i] != null) temp[j++] = s[i];
        }

        Arrays.sort(temp, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (new BigDecimal(o2).compareTo(new BigDecimal(o1)));
            }
        });
        s = temp;


        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
