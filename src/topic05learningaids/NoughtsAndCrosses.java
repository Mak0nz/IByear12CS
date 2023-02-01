package topic05learningaids;

/**
 * Describe the nature of 2D arrays.
 * Construct algorithms with 2D arrays.
 */
public class NoughtsAndCrosses {

    static char[][] grid;
    
    public static void main(String[] args) {
        // allocate memory for mygrid
        grid = new char[3][3];
        displayGrid();

        // filling the first row with crosses
        grid[0][0] = 'X';
        grid[0][1] = 'X';
        grid[0][2] = 'X';

        displayGrid();

    }

    public static void displayGrid() {
        // TODO
        for (int row = 0; row < 3; row++) { // jump to row (vertically)
            System.out.println("-------------------");
            for (int col = 0; col < 3; col++) { // jump to col (horizontally)
                if (grid[row][col] == 0) {
                    grid[row][col] = ' ';
                }
                System.out.print("|  " + grid[row][col]);
                if (col == 2) {
                    System.out.print("  |");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("-------------------");
    }

    public static boolean horizontalCheck(int row, char symbol) {
        for (int i = 0; i < grid[row].length; i++) {
            if (grid[row][i] != symbol) {
                return false;
            }
        }
        return false;
    }

    public static boolean verticalCheck(int col, char symbol) {
        for (int row = 0; row < grid.length; row++) {
            if (grid[row][col] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean diagonalCheck(char symbol) {
        boolean winRight = true;
        boolean winLeft = true;
        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[0].length; col++){
                if (row == col) {
                    if(grid[row][col] != symbol) {
                        return winRight;
                    }
                } else if ((row + col) == grid.length -1) {
                    if (grid[row][col] != symbol) {
                        winLeft = false;
                    }
                }
            }
        }
        return winRight || winLeft;
    }

    public static boolean isWinningMove(int col, char symbol) {
        return diagonalCheck(symbol) || verticalCheck(col, symbol) || horizontalCheck(col, symbol);
    }
}