public class Solution {
    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, backtrack(grid, i, j));
                }
            }
        }
        return maxGold;
    }
    
    private int backtrack(int[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) {
            return 0;
        }
        
        int temp = grid[row][col];
        grid[row][col] = 0; // mark as visited
        
        int maxGold = 0;
        maxGold = Math.max(maxGold, temp + backtrack(grid, row + 1, col)); // go down
        maxGold = Math.max(maxGold, temp + backtrack(grid, row - 1, col)); // go up
        maxGold = Math.max(maxGold, temp + backtrack(grid, row, col + 1)); // go right
        maxGold = Math.max(maxGold, temp + backtrack(grid, row, col - 1)); // go left
        
        grid[row][col] = temp; // backtrack
        return maxGold;
    }
}
