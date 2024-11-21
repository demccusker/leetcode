class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> rows = new HashMap<>();
        int count = 0;
        for (int[] row : grid){
            String key = convertToKey(row);
            rows.put(key,rows.getOrDefault(key, 0) + 1);
        }
        Map<String,Integer> columns = new HashMap<>();
        for (int col = 0; col < grid[0].length; col++){
            int[] currentColumn = new int[grid.length];
            for (int row = 0; row < grid.length; row++){
                currentColumn[row] = grid[row][col];
            }
            String key = convertToKey(currentColumn);
            columns.put(key,columns.getOrDefault(key, 0) + 1);
            
            

        }
        
        for (String key : rows.keySet()){
            count = count + (rows.get(key) * columns.getOrDefault(key,0));
        }
        return count;

    }

    public String convertToKey(int[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i : arr){
            sb.append(i);
            sb.append(",");
        }
        return sb.toString();

    }
}