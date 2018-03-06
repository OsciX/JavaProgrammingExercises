/*
    CurrencyConverterTester.java
    Written by Ryan Davis on 3/1/2018
*/

import java.util.Scanner;
public class CurrencyConverterTester {
    public static void main(String[] args) {
        boolean convertMore = true;


        Scanner in = new Scanner(System.in);
        System.out.print("Input the price of 1 dollar in Euro: €");
        CurrencyConverter usdToEuro = new CurrencyConverter(in.nextDouble(), '€');

        while (convertMore) {

            System.out.print("\nEnter dollar amount to convert to Euro: $");

            if (in.hasNextDouble())
            {
                double dollars = in.nextDouble();
                System.out.printf("$%.2f in Euros is equal to %s\n", dollars, usdToEuro.convertf(dollars));
            }

            else if (in.next().equals("Q"))
            {
                convertMore = false;
                System.out.println("Goodbye!");
            }

            else
            {
                System.out.println("Invalid input entered.");
            }

        }
    }
}