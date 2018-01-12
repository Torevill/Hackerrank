package bigNumber.bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-biginteger/problem
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}