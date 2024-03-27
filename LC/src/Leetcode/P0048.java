package Leetcode;

public class P0048 {

    /**
     * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
     *
     * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
     * DO NOT allocate another 2D matrix and do the rotation.
     *
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [[7,4,1],[8,5,2],[9,6,3]]
     */
    public void rotate(int[][] matrix) {
        // reverse the order
        for (int i = 0; i < matrix.length; i++) {
            int m = 0;
            int k = matrix.length - 1;
            while(m < k) {
                swap(matrix, m, i, k, i);
                m++;
                k--;
            }
        }
        // then transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                swap(matrix, i , j,j , i);
            }
        }
    }

    private void swap(int[][] matrix, int x, int y, int m, int k) {
        int temp = matrix[x][y];
        matrix[x][y] = matrix[m][k];
        matrix[m][k] = temp;
    }
    
}
