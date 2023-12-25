package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0119 {
    /**
     * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
     *
     * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
     *
     * Input: rowIndex = 3
     * Output: [1,3,3,1]
     */

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i = 1; i <= rowIndex; i++) {
            row.add((int) ( (long) row.get(i-1) * (rowIndex-i+1)/i) );
        }
        return row;
    }

    public List<Integer> getRow2(int rowIndex) {
        if (rowIndex == 0) {
            return List.of(1);
        }

        List<Integer> currentRow = List.of(1);
        List<Integer> previousRow = List.of(1);

        for(int i = 1; i < rowIndex; i++) {
            currentRow = List.of(1);
            for(int j = 1; j < i; j++) {
                int sum = previousRow.get(j-1) + previousRow.get(j);
                currentRow.add(sum);
            }
            currentRow.add(1);
            previousRow = currentRow;
        }
        return currentRow;
    }
}
