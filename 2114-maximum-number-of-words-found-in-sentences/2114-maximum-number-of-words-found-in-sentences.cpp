class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int count = 1;
        int ans = 0;
        for(int i = 0; i<sentences.size(); i++){
            for(int j = 0; j<sentences[i].size(); j++){
                if (sentences[i][j] == ' '){
                    count++;
                }
                ans = max(count, ans);
    
            }
            
            count = 1;
        }
    
    return ans ;
    }
};