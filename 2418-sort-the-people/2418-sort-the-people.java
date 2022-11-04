class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        //USING BUBBLE SORT
        boolean swapped;
        for(int i = 0; i<names.length -1; i++){
            swapped = false;
            for(int j = 0; j< names.length - i -1; j++){
                if(heights[j] < heights[j + 1]){
                    //swappping heights
                    int temp = heights[j] ;
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    
                    //swapping the names too
                    String temp1 = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp1;
                    
                    swapped = true;
                } 
            } 
            if(swapped == false) break;
        }  
            
        return names;
    }
}