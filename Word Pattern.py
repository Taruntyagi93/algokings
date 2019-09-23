# Given a pattern and a string str, find if str follows the same pattern.

# Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

# Example 1:

# Input: pattern = "abba", str = "dog cat cat dog"
# Output: true
# Strategy :
# Convert both the strings into two arrays x and y
# Then compare elements on the same indexes of the array by using a dictionary/hashmap

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        x=list(pattern) #split at every alphabet a,b,b,a
        y=str.split(" ") #split at space dog,cat,dog,cat
        result={}
        if (pattern=="" or str=="" or len(x)!=len(y)):
            return False
        else:
            for i in range(len(x)):
                if x[i] in result.keys(): #if alphabet is already in hash map
                    if y[i]!=result[x[i]]: #if the current word is different from what is there in hashmap
                        return False
                else:
                    if y[i] in result.values(): #if two keys have the same value
                        return False
                    result[x[i]]=y[i]  #add new alphabet from x as the key and word from y as value
            return True