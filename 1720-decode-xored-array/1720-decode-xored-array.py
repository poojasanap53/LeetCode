class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        n = len(encoded)+1
        arr = [None] *n
        
        for i in range(n):
            if i == n-1:
                break
            if i == 0:
                arr[i] = first
            arr[i+1] = encoded[i] ^ arr[i]
            # print(arr[i])
        return (arr)