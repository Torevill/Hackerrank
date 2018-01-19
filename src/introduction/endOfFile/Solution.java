package introduction.endOfFile;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-end-of-file/problem
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNext()) {
            i++;
            System.out.printf("%d %s%n", i, scanner.nextLine());
        }
        scanner.close();
    }
}
