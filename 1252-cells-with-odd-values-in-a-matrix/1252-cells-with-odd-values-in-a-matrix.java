class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] result = new int[m][n];
 
        for(int[]a: indices){
            int row = a[0];
            int col = a[1];

            for(int i= 0;i < n ;++i)
                result[row][i] += 1;
            for(int i =0;i < m;++i)
                result[i][col] += 1;
        }
        
        int ct = 0;
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                if(result[i][j] % 2 != 0){
                    ct++;
                }
            }
        }
        
        return ct;
    }
}