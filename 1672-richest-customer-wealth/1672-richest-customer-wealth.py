class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        m = len(accounts)
        
        final = []
        for i in range(m):
            total = sum(accounts[i])
            final.append(total)
            
        return (max(final))