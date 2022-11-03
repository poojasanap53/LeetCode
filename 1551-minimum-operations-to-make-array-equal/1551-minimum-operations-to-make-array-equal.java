class Solution {
    public int minOperations(int n) {
        int[] arr = new int[n];
        //getting the elements of the arrays
        for(int i = 0; i < n; i++){
            arr[i] = (2 * i) + 1;
        }
        
        int count = 0;
        for(int i = 0; i< n/2; i++){
          count += (arr[n - i - 1] - arr[i] )/2;
        }
        return count;
    }
}