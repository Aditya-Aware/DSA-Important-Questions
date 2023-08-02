package ImpQuestions;

public class SpialMatrix {

    public static int printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix.length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endRow] + " ");
            }
            //bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(matrix[endRow][j] + " ");
                if (startRow == endRow) {
                    break;
                }
            }
            //left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startCol] + " ");
                if (startCol == endCol) {
                    break;
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return startRow;
    }
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {7, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.println(printSpiral(matrix));
    }
}