class Solution:
    def freqAlphabets(self, s: str) -> str:
        for j in range(10,27):
            s = s.replace(str(j)+'#',chr(96+j))
        for j in range(1,10):
            s = s.replace(str(j),chr(96+j))
        return s