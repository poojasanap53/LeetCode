class Solution {
    public int findJudge(int n, int[][] trust) {
        //if theres is only one person he can be the judge
        if(n ==1){
            return 1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i< trust.length; i++){
            if(map.containsKey(trust[i][1])){
                map.put(trust[i][1], map.get(trust[i][1]) + 1);
            }
            else{
                map.put(trust[i][1], 1);
            }
        }
        
        // everybody except judge trusts him, so total should be one less than n
        int judge = -1;
        int value = n - 1;
        for (Map.Entry<Integer, Integer> mp : map.entrySet())
        {
            if (value == mp.getValue()) {
               judge =  mp.getKey();
            }
        }
        
        //since judge trusts nobody, we just have to check if the value for judge is null or not
         HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i = 0 ; i< trust.length; i++){
            if(map2.containsKey(trust[i][0])){
                map2.put(trust[i][0], map2.get(trust[i][0]) + 1);
            }
            else{
                map2.put(trust[i][0], 1);
            }
        }
        
        if(map2.get(judge) != null){
            judge = -1;
        }
        
        return judge;
    }
}