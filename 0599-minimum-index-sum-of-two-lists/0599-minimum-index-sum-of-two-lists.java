class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> ans = new ArrayList<>();
        HashMap <String, Integer> map = new HashMap<>();
        
        //first take all strings of list 1 
        for(int i = 0; i<list1.length; i++){
            map.put(list1[i], i);
        }
        
        int min = Integer.MAX_VALUE;
        for(int j = 0; j <list2.length; j++){
            // check if list2 contains the element 
            if(map.containsKey(list2[j])){
                // get the index sum
                int sum = map.get(list2[j]) + j;
                //if sum is minimum add it to the list and alter min value 
                if(sum<min){
                    ans.clear();
                    ans.add(list2[j]);
                    min = sum;
                }
                else if(sum == min)
                    ans.add(list2[j]);
            }     
        }
        // System.out.println(map);
        
        String[] res = new String[ans.size()];
        for(int i = 0; i<res.length; i++){
            res[i] = ans.get(i);
        }
            
        return res;
        
    }
}