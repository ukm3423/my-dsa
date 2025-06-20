package demo;

public class Solution4 {
    public static void main(String[] args) {
        int[][] grid = {{2,4,3,5},{5,4,9,3},{3,4,2,11},{10,9,13,15}};

        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[row].length; col++){
                System.out.print(grid[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
