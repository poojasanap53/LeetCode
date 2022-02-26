class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        splitted =[nums[i:i+2] for i in range(0, len(nums), 2)]
        # print(splitted)
        
        final = []
        for i in splitted:
            # print(i)
            freq = i[0]
            val = i[1]
            
            for j in range(freq):
                final.append(val)
            # print(final)
            
        return (final)