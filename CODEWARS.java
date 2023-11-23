public class CODEWARS {
    public static void main(String[] args) {
        /*int[][] a = {
                {1, 2},
                {3, 2}
        };
        int[][] b = {
                {3, 2},
                {1, 1}
        };
        int[][] result = matrixMultiplication(a, b);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }*/
        /*int[][] a = {
                {9, 7},
                {0, 1}
        };
        int[][] b = {
                {1, 1},
                {4, 12}
        };
        int[][] result = matrixMultiplication(a, b);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }*/
        int[][] a = {
                {1, 2, 3},
                {3, 2, 1},
                {2, 1, 3}
        };
        int[][] b = {
                {4, 5, 6},
                {6, 5, 4},
                {4, 6, 5}
        };
        int[][] result = matrixMultiplication(a, b);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        if (a == null || b == null || a[0].length != b[0].length) {
            return null;
        }
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < b[0].length; ++j) {
                for (int k = 0; k < b.length; ++k) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}