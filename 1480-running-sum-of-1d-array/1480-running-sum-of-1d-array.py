class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        n = len(nums)
        
        total = 0 
        final = []
        for i in range(n):
            nums[i] = nums[i] + total
            total = nums[i]
            
            final.append(total)
            
        return final