/*
        Number.java
        Written by Ryan Davis on 3/5/18
*/

public class Number {
    public static int getForSum(int number) {
        int sum = 0;
        for (int i=1; i<=number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int getWhileSum(int number) {
        int sum = 0;
        int i = 1;
        while(i <= number) {
            sum += i;
            i++;
        }
        return sum;
    }

}