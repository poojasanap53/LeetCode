from collections import Counter
class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        count = collections.Counter(nums)
        # print(count)
        
        val = list(count.values())
        # print(val)
        
        total = 0 
        for i in range(len(val)):
            n = val[i]
            summ = (n*(n-1))//2
            total += summ
        return total