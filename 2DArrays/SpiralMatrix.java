import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return result;

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            // top
            for (int j = startColumn; j <= endColumn; j++) {
                result.add(matrix[startRow][j]);
            }
            startRow++;

            // right
            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endColumn]);
            }
            endColumn--;

            // bottom
            if (startRow <= endRow) {
                for (int j = endColumn; j >= startColumn; j--) {
                    result.add(matrix[endRow][j]);
                }
                endRow--;
            }

            // left
            if (startColumn <= endColumn) {
                for (int i = endRow; i >= startRow; i--) {
                    result.add(matrix[i][startColumn]);
                }
                startColumn++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        //Matrix initialization.
        int[][] matrix = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        
        List<Integer> ans = spiralMatrix.spiralOrder(matrix);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}
