class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false;
        boolean heavy = false;
        long vol = (long) (length*((long)(width*height)));
        if(length >= 10000 || width >= 10000 || height >= 10000 || vol >= 1000000000){
            bulky = true;
        }
        if(mass >= 100){
            heavy = true;
        }
        
        
        String ans = "";
        if(heavy && bulky ){
            ans = "Both";
        }
        if(!heavy && !bulky){
            ans = "Neither";
        }
        if(!heavy && bulky){
            ans = "Bulky";
        }
        if(heavy && !bulky){
            ans= "Heavy";
        }
        
        return ans;
    }
}