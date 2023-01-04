class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i<tasks.length; i++){
            if(map.containsKey(tasks[i])){
                map.put(tasks[i], map.get(tasks[i]) + 1);
            }
            else{
                map.put(tasks[i], 1);
            }
        }

        int ct = 0;
        for(int key : map.keySet())
        {
            int val = map.get(key);
            if(val == 1){
                return -1;
            }
            if(val == 2 || val == 3){
                ct++;
            }
            else if(val%3 == 0){
                ct += val/3;
            }   
            else
                ct += (val/3)+1;
        }
        
        return ct;
    }
}