class Solution:
    def kidsWithCandies(self, c: List[int], ec: int) -> List[bool]:
        result = []
        maxi = max(c)
        for i in c:
            
            if i + ec >= maxi:
                result.append(True)
            else:
                result.append(False)
            
           
        return (result)