class Solution {
    public String generateTheString(int n) {
        String ans = "";
        for(int i = 1; i<n; i++){
            ans += 'a'; 
        }
        if(n % 2 == 0 ){
            ans += 'b';
        }
        else{
            ans += 'a';
        }
        
        return ans;
    }
}