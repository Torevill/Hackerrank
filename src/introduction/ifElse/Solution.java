package introduction.ifElse;
//https://www.hackerrank.com/challenges/java-if-else/problem
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n % 2 == 1 || (n >= 6 && n <= 20)) System.out.println("Weird");
        else System.out.println("Not Weird");

    }
}
