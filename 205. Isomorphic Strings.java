/*Question {{
                Given two strings s and t, determine if they are isomorphic.
                Two strings are isomorphic if the characters in s can be replaced to get t.
                All occurrences of a character must be replaced with another character while preserving the order 
                of characters. No two characters may map to the same character but a character may map to itself.

                Example 1:
                Input: s = "egg", t = "add"
                Output: true

                Example 2:
                Input: s = "foo", t = "bar"
                Output: false

                Example 3:
                Input: s = "paper", t = "title"
                Output: true
            }}

Solution by HashTable:

example of "egg" and "add"

-> First we will check if the length of one string is less than another than return false.
-> We will create a HashTable.
-> run loop till length of a string
-> Take first character from frist string and check if it is not present as a Key in the HashTable and 
    check the first char from second string, if it is present as a value in the table.
-> If it does return false, if not add the key value pair.
-> Now if the first if conditional fails then we will check compair the value of key (first char from first string)
    with the first char from string b.
-> if it matches return true if not return false. 

*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
          if(s.length() != t.length()){
            return false; //Return false, if of unequal length
        }
		
        HashMap<Character, Character> map = new HashMap<>();
        char a;
        char b;        
        for(int i =0;i<s.length();++i){
            a = s.charAt(i);
            b = t.charAt(i);
            if(map.get(a) == null){
                if(map.containsValue(b)){
                    return false;
                }
                map.put(a,b);
            }
            else if(b != map.get(a)){
                return false;
            }
        }        
        return true;
    }
}


/*
Solution by Array

> First we will check if the length of one string is less than another than return false.
-> We will create two integer array of length 128.
-> run loop till length of a string
-> We will check the count at the ascii position of the first character of first string to 
the count at the ascii position of the first character of secong string. 
-> If it does not match return false
-> If it does add 1 at both the position

*/


class Solution {
    public boolean isIsomorphic(String s, String t) {
          if(s.length() != t.length()){
            return false; //Return false, if of unequal length
        }
		int [] arr1 = new int[128];
        int [] arr2 = new int[128];
        for(int i =0;i<s.length();++i){
            if(arr1[s.charAt(i)] != arr2[t.charAt(i)]) return false;
            arr1[s.charAt(i)] = i+1;
            arr2[t.charAt(i)] = i+1; 
        }
        return true;
    }
}