class Solution:
    def countBits(self, n: int) -> List[int]:
        count = []
        for i in range(n+1):
            #convert to a binary
            b = str(bin(i).replace("0b", ""))
            #counting the number of ones
            b = b.count("1")
            #adding them to a list
            count.append(b)
            
        return count 