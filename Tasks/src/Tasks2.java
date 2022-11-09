
public class Tasks2 {
    public static void matrixRotation(int[][] matrix,int rotations){
        int matrixLength = matrix.length;

        for (int n = 0; n < rotations % 4; n++) {
            int[][] rotateMatrix = new int[matrixLength][matrixLength];
            for (int i = 0; i < matrixLength; i++) {
                for (int j =0 ; j < matrixLength; j++) {
                    rotateMatrix[i][j] = matrix[matrixLength-1-j][i];
                }
            }

            matrix = rotateMatrix;
        }

        int k=0;
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                if (j == matrixLength - 1) {
                    k = j;
                    continue;
                }
                System.out.print(ints[j] + "_");
            }
            System.out.print(ints[k]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        matrixRotation(new int[][]{{1,2,3},{4, 5, 6},{7,8,9}},2);
    }

}
