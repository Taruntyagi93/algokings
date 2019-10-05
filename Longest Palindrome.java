/* Solution by ASCII value using array of size 128

-> What we will do is at every occurence of an character, we will add 1 to the ascii position of that array and then
    we will iterate through this array and take a variable ans and add even pairs to that and at the end add one odd value
    to get our final answer
-> to do this follow below steps
-> To solve this question we have to take a array of size 128
-> To get each character of the string we have to convert it to character array
-> take a variable ans
-> loop through the ascii array
-> [[ans += v / 2 * 2]] functioning of this formula: if v is 5 and ans is 0 in begining then ans= ans + ((5/2) * 2) ==>
ans + (2*2) ==> ans +4 
-> if (ans % 2 == 0 && v % 2 == 1) this statements checks is the ans is even but the value of v at that time is even
    then add 1 to the ans. This statement will only run for the first occurence of an even no after that this statement will never run.
-> at the end return ans
*/

class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}



class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
         for (int i=0; i<s.length(); i++) {
            char le = s.charAt(i);
            if (!map.containsKey(le)) {
                map.put(le,1);
            }
            else {
                map.put(le,map.get(le)+1);
            }
         }
        boolean single = false;
        int count = 0;
        for (int inte : map.values()) {
             if (inte%2==1) {
                 single = true;
             }
             count=count+(inte/2)*2;
        }
        return single? count+1 : count;
    }
