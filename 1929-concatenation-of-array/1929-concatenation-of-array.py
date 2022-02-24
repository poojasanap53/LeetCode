class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        #getting size of nums
        n = len(nums)
        
        #initilization of ans array
        ans = []
        
        
        for j in range(2):
            for i in range(n):
                ans.append(nums[i])

        return ans
            
            
            