public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String num = Integer.toBinaryString(n);
        int ct = 0;
        for(int i = 0; i<num.length(); i++){
            if(num.charAt(i) == '1'){
                ct++;
            }
        }
        System.out.println(num);
        
        return ct;
    }
}