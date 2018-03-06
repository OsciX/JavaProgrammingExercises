/*
        NumberTester`.java
        Written by Ryan Davis on 3/5/18
*/

import java.util.Scanner;
public class NumberTester extends Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum number to add to: ");
        int max = sc.nextInt();
        System.out.print("\nSum Results:");
        System.out.printf("\n\tFor Loop: %d", getForSum(max));
        System.out.printf("\n\tWhile Loop: %d", getWhileSum(max));
        System.out.printf("\n\tSum Verification: %s", max*(max+1)/2 == getForSum(max) && getForSum(max) == getWhileSum(max));
    }
}
