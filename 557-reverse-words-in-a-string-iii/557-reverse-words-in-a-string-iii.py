class Solution:
    def reverseWords(self, s: str) -> str:
        # splits string into a list of words
        words = s.split()
        
        lst = []
        
        for word in words:
            # to reverse the words
            word = word[::-1]
            
            lst.append(word)
            
            #to convert list into string
            result = (" ").join(lst)
            
        return (result)