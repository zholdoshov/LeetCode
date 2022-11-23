class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            for (int j = 0; j < i; j++){
                
                if (j == 0 || j == i-1) {
                    row.add(1); 
                } else {
                    row.add(triangle.get(i-2).get(j-1) + triangle.get(i-2).get(j));
                }
            }
            triangle.add(row);
        }
        
        return triangle;
    }
}

/* if row's index is 0 or row.length-1 then apply 1 for that indexes else
sum of (j-1's element of the row and j's element of the row)
*/