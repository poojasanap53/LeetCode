class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        #geeting length of nums array
        n = len(nums)
        #initilization of ans array
        ans = []
        
        for i in range(n):
            ans.append(nums[nums[i]]) 
        
        return ans