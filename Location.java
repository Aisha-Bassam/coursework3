/**
 * Represent a location in a rectangular grid.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */

public class Location {

    private int row;
    private int col;

    /**
     * Represent a row and column.
     * @param row The row.
     * @param col The column.
     */
    public Location(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * Implement content equality.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Location) {
            Location other = (Location) obj;
            return row == other.getRow() && col == other.getCol();
        }
        else {
            return false;
        }
    }

    /**
     * Return a string of the form row,column
     * @return A string representation of the location.
     */
    public String toString() {
        return row + "," + col;
    }

    /**
     * Use the top 16 bits for the row value and the bottom for
     * the column. Except for very big grids, this should give a
     * unique hash code for each (row, col) pair.
     * @return A hashcode for the location.
     */
    
    /*
     * In the code snippet you provided, the expression (row << 16) is a bitwise left shift operation. 

       In Java, the shift operators << and >> move the bits of a binary number to the left or right by a specified number of positions. In this case, row << 16 means shifting the binary representation of the row integer left by 16 positions.

       When you shift bits to the left by 16 positions, you are effectively multiplying the row value by 2^16 (which is 65,536). This operation helps combine the row and col values into a single integer value for the hash code.

       As for the return type of the hashCode() method, it is declared as int, so the method must return an integer value. The result of (row << 16) + col is an integer value which is calculated by concatenating the shifted row value and the col value together.

       Essentially, the hashCode() method in your code snippet generates a hash code for some object based on the row and col values by combining them into a single integer value.
     */
    public int hashCode() {
        return (row << 16) + col;
    }

    /**
     * @return The row.
     */
    public int getRow() {
        return row;
    }

    /**
     * @return The column.
     */
    public int getCol() {
        return col;
    }
}
