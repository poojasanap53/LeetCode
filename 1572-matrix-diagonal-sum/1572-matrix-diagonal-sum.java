class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
                int j = i;
                sum += mat[i][j];   
        }
        
        for(int i = 0; i<n; i++){
            int j = n - 1 - i;
            sum += mat[i][j];
        }
        if(n % 2 !=0 ){
            sum -= mat[n/2][n/2];
        }
        
        return  sum;
    }
}