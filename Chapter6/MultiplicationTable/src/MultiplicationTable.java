/**
 * The MultiplicationTable class generates a formatted multiplication table
 * string when given a dimension.
 *
 * @author  Ryan Davis
 * @version 1.0
 * @since   2018-3-3
 */

public class MultiplicationTable {
    private int dim;
    private String tempString;

    /**
     * Constructor.
     *
     * @param dimension (required) numbers of columns and rows generated.
     *                  For a typical 12x12 table, the dimension is 12.
     *
     */
    public MultiplicationTable(int dimension) {
        dim = dimension;
        tempString = new String();
    }

    /**
     *
     * Generate the multiplication table string.
     * @return A formatted multiplication table string, or "Invalid input entered." if the dimension is invalid.
     *
     */
    public String createMultiplicationTable() {
        if (dim > 0) {
            tempString += "\n\t\t";
            for (int i = 1; i <= dim; i++) {
                tempString += String.format("%d\t\t", i);
            }
            tempString += "\n\t╔";
            for (int i = 1; i <= dim * 8; i++) {
                tempString += "═";
            }
            ;
            for (int i = 1; i <= dim; i++) {
                tempString += String.format("\n%d\t║\t", i);
                for (int j = 1; j <= dim; j++) {
                    tempString += String.format("%d\t\t", i * j);
                }
            }
        } else {
            tempString = "Invalid input entered.\n";
        }
        tempString += "\n";
        return tempString;
    }
}
