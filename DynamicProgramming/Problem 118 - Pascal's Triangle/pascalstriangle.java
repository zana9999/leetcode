import java.util.*;

class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(new ArrayList<>(List.of(1)));

        for(int i = 1; i < numRows; i++){
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);

            for(int j = 1; j < i; j++){
                int sum = prevRow.get(j-1) + prevRow.get(j);
                newRow.add(sum);
            }

            newRow.add(1);
            triangle.add(newRow);
        }

        return triangle;

    }
}
