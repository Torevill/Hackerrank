package bigNumber.Primality;
//https://www.hackerrank.com/challenges/java-primality-test/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        System.out.println(n.isProbablePrime(128) ? "prime" : "not prime");
    }
}
