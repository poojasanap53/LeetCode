class Solution {
    public int subtractProductAndSum(int n) {
        // convert into a string 
        String s = Integer.toString(n);
        int pro = 1;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            //getting the digits in charachter format and then converting them to int 
            int ch = Character.getNumericValue(s.charAt(i));
            pro *= ch;
            sum += ch;
        }
        
        //returning the final result 
        return pro - sum;
    }
}