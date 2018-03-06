/*
    FibonacciGenerator.java
    Written by Ryan Davis on 3/2/2018
*/

public class FibonacciGenerator {

    private int count;

    public FibonacciGenerator() {
        count = 0;
    }

    private int sequence(int n) {
        return n > 1 ? sequence(n - 1) + sequence(n - 2) : n;
    }

    public int nextNumber(){
        count++;
        return sequence(count);
    }

}