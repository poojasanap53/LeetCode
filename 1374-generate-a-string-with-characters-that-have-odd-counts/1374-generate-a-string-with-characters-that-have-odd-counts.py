class Solution:
    def generateTheString(self, n: int) -> str:
        final = ""
        if n%2 == 0:
            final += (n-1)*'a' + 'b'
            
        else:
            final += n*'a'
        return final