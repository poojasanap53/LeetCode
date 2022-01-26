class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        if ch in word:
            index = word.index(ch)

            first = word[:index+1]

            second = word[index+1:]

            # To reverse the first substring 
            first = first[::-1]
            
            #To get the final string
            final = first + second

            return final
        
        else:
            return word