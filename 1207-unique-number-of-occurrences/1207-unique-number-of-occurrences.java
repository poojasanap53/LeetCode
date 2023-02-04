class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        
        List <Integer> freq = new ArrayList<>();
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
            int val = mapElement.getValue();
            if(freq.contains(val)){
                return false;
            }
            else{
               freq.add(val);  
            }   
        }
        
        return true;
    }
}