class Solution {
    public int heightChecker(int[] heights) {
        //copying elements from heights to expected
        int[] expected = Arrays.copyOfRange(heights, 0, heights.length);
        //sorting the array using methods 
        Arrays.sort(expected);
        int ct = 0;
        for(int i = 0; i<heights.length; i++){
            if(heights[i] != expected[i]){
                ct++;
            }
        }
        return ct;
    }
}