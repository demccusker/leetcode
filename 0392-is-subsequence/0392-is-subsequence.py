class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        isSubsequence = False
        sIndexes = []
        if s == "":
            isSubsequence = True
        startIndex = 0
        for letter in s:
            
            if letter not in t:
                return isSubsequence
            else:
                try:
                    newIndex = t.index(letter,startIndex)
                except:
                    return isSubsequence
                sIndexes.append(newIndex)
                startIndex = newIndex + 1
        if len(sIndexes) == 1:
            isSubsequence = True
        
        if len(sIndexes) == 2 and sIndexes[0] < sIndexes[1]:
            isSubsequence = True
        
        for x in range(len(sIndexes) - 2):
            
            if sIndexes[x] < sIndexes[x + 1]:
                
                isSubsequence = True



        return isSubsequence
