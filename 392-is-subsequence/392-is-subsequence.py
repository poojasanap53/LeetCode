class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if len(t) < len(s):
            return False
        if len(s)==0:
            return True
        j=0
        p=""
        for i in t:
            if i==s[j]:
                p+=i
                j+=1
            if j>=len(s):
                break
        return p==s