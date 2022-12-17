class Solution {
    public int countAsterisks(String s) {
        String [] arr = s.replace("|", " ").split(" ");
        System.out.println(Arrays.toString(arr));
        int ct = 0;
        for(int i = 0; i<arr.length; i+=2){
            for(char c : arr[i].toCharArray()){
                if(c=='*'){
                    ct++;
                }
            }
        }
        
        return ct;
    }
}