class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if (n == 1){
            ans[0] = 0;
        }
        
        else if(n % 2 ==0){
            for(int i = 0; i<n; i++){
                ans[i] = i * 2 - n + 1; 
            }
        }
        
        else if(n % 2 != 0 ){
            int a = n / 2;
            for(int i = 0; i<n; i++){
                ans[i] = -a + i; 
                
            }
        }
        
        
        return ans;
    }
}