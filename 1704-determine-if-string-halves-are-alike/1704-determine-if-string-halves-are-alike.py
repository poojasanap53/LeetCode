class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        length = int(len(s)/2)
        
        a = s[0:length]
        # print(a)
        b = s[length:]
        # print(b)
        
        count_a = 0
        for i in range(0, len(a)):
            if a[i] in vowels:
                count_a += 1
                
        # print(count_a)
        
        count_b = 0
        for i in range(0, len(b)):
            if b[i] in vowels:
                count_b += 1
                
        # print(count_b)
        
        
        if count_a == count_b :
            return True
        else:
            return False