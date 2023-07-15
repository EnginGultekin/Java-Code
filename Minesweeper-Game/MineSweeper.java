import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class MineSweeper {
    private final int rowNumber;
    private final int colNumber;
    private final int numMines;
    private int numUncovered;
    private final int[][] matrix;    // Ex. matrix[3][3]
    private final boolean[][] opened;    // opened[3][3]


    public MineSweeper(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.numMines = (rowNumber * colNumber) / 4;
        this.numUncovered = 0;
        this.matrix = new int[rowNumber][colNumber];
        this.opened = new boolean[rowNumber][colNumber];

        initializeMinefield(); // Set all values to 0
        placeMines(); // Randomly place mines
        programmerMap(); // Programmer Map
        calculateAdjacentMines(); //  Calculates each digit based on mines

    }

    private void calculateAdjacentMines() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (matrix[i][j] != -1) {
                    int count = 0;

                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (k >= 0 && k < rowNumber && l >= 0
                                    && l < colNumber && matrix[k][l] == -1) {
                                count++;
                            }
                        }
                    }
                    matrix[i][j] = count;
                }
            }
        }
    }

    public void play(){
        Scanner input = new Scanner(System.in);
        boolean gameOver = false;

        System.out.println("Welcome to Minesweeper Game !");
        System.out.println("Uncover all the cells without hitting a mine to win.");

        while(!gameOver){
            printMinefield();
            System.out.print("Enter Row: ");
            int row = input.nextInt();

            System.out.print("Enter Column: ");
            int col = input.nextInt();

            if (isValidMove(row, col)) {
                if(isMine(row, col)){
                    gameOver = true;
                    System.out.println("Game Over! You hit a mine.");
                }
                else {
                    uncoverCell(row, col);
                    if (numUncovered == (rowNumber * colNumber - numMines)) {
                        gameOver = true; // for end
                        printMinefield();
                        System.out.println("Congratulations! You won!");
                    }
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private boolean isValidMove(int row, int col) {
        // Does your row and column provide and has it been opened before?
        return row >= 0 && row < rowNumber && col >= 0 && col < colNumber && !opened[row][col];
    }

    private boolean isMine(int row, int col){
        return matrix[row][col] == -1;
    }

    private void uncoverCell(int row, int col) {
        if (!opened[row][col]) {
            opened[row][col] = true;
            numUncovered++;
        }
    }

    private void initializeMinefield(){         //  Ex.  0  0  0
        for(int[] row : this.matrix){               //   0  0  0
            Arrays.fill(row,0);                //    0  0  0
        }
    }

    private void placeMines() {             // Ex.   -1   0   0
        Random random = new Random();          //     0   0  -1
        for(int i = 0; i < numMines; i++){     //     0   0   0

            int row = random.nextInt(rowNumber); // Random number in rowNumber range
            int col = random.nextInt(colNumber); // Random number in colNumber range

            if (matrix[row][col] != -1) {
                matrix[row][col] = -1;
            } else i--;
        }
    }

    private void printMinefield() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (opened[i][j]) {   // if not 0 meaning open or not
                    if (matrix[i][j] == -1) {
                        System.out.print("* "); // this is minefield
                    } else {
                        System.out.print(matrix[i][j] + " ");  // open field
                    }
                } else {
                    System.out.print("- ");  // if 0 meaning unopened
                }
            }
            System.out.println();
        }
        System.out.println("===============================");
    }

    private void programmerMap() {
        System.out.println("Programmer Map");
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (matrix[i][j] == 0) {   // if not 0
                    System.out.print("  -");
                } else {
                    System.out.print("  *");  // if 0 meaning unopened
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
