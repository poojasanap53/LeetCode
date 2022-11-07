class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        
        //for flipping 
        for(int i = 0; i<n; i++){
            int m = image[i].length;
            for(int j = 0; j<m/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][m-j -1];
                image[i][m-j-1] = temp;    
            } 
        }
        
        //for inverting
        for(int i = 0; i<n; i++){
            int m = image[i].length;
            for(int j = 0; j<m; j++){
                  if(image[i][j] == 0){
                      image[i][j] = 1;
                  }
                else{
                    image[i][j] = 0;
                }
            } 
        }
        
        return image;
        
    }
}