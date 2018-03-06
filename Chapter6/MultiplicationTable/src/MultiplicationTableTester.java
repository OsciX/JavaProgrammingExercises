/**
 * The MultiplicationTableTester class demonstrates use of the
 * MultiplicationTable class to generate and display a
 * multiplication table.
 *
 * @author  Ryan Davis
 * @version 1.0
 * @since   2018-3-3
 */

import java.util.Scanner;

public class MultiplicationTableTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continuePrompt = true;
        String output;
        while (continuePrompt) {
            System.out.print("Enter multiplication table dimension: ");
            int input = in.nextInt();
            MultiplicationTable test = new MultiplicationTable(input);
            output = test.createMultiplicationTable();
            if (output.contains("1")) { continuePrompt = false; }
            System.out.print(output);
        }
    }
}
