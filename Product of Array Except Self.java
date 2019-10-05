/*

1) Initialize the empty answer array where for a given index i, answer[i] would contain the product of all the numbers to the left of i.

2)We construct the answer array the same way we constructed the L array in the previous approach. These two algorithms are exactly the same except that we are trying to save up on space.

3)The only change in this approach is that we don't explicitly build the R array from before. Instead, we simply use a variable to keep track of the running product of elements to the right and we keep updating the answer array by doing answer[i]=answer[i]∗Ranswer[i] = answer[i] * Ranswer[i]=answer[i]∗R. For a given index i, answer[i] contains the product of all the elements to the left and R would contain product of all the elements to the right. We then update R as R=R∗nums[i]R = R * nums[i]R=R∗nums[i]


*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int [] answer = new int[length];
        answer[0] = 1;
        
        for(int i=1; i<length;i++){
            answer[i] = nums[i-1]*answer[i-1];
        }
        
        int R =1;
        for(int i =length-1; i>=0;i--){
            answer[i]=answer[i]*R;
            R *= nums[i];
        }
        
        return answer;
    }
}
/*


1) Initialize two empty arrays, L and R where for a given index i, L[i] would contain the product of all the numbers to the left of i and R[i] would contain the product of all the numbers to the right of i.

2) We would need two different loops to fill in values for the two arrays. For the array L, L[0]L[0]L[0] would be 1 since there are no elements to the left of the first element. For the rest of the elements, we simply use L[i]=L[i−1]∗nums[i−1]L[i] = L[i - 1] * nums[i - 1]L[i]=L[i−1]∗nums[i−1]. Remember that L[i] represents product of all the elements to the left of element at index i.

3) For the other array, we do the same thing but in reverse i.e. we start with the initial value of 1 in R[length−1]R[length - 1]R[length−1] where lengthlengthlength is the number of elements in the array, and keep updating R[i] in reverse. Essentially, R[i]=R[i+1]∗nums[i+1]R[i] = R[i + 1] * nums[i + 1]R[i]=R[i+1]∗nums[i+1]. Remember that R[i] represents product of all the elements to the right of element at index i.

4) Once we have the two arrays set up properly, we simply iterate over the input array one element at a time, and for each element at index i, we find the product except self as L[i]∗R[i]L[i] * R[i]L[i]∗R[i].

        */

class Solution {
    public int[] productExceptSelf(int[] nums) {
    int length = nums.length;
        int[] Left = new int[length];
        int [] Right = new int[length];
        int [] answer = new int[length];
        
        Left[0]=1;
        for(int i=1; i<length;i++){
            Left[i] = nums[i-1]*Left[i-1];
        }
        Right[length-1] = 1;
        for(int i= length-2; i>=0;i--){
            Right[i]=nums[i+1]*Right[i+1];
        }
        for(int i=0;i<length;i++){
            answer[i]= Left[i]*Right[i];
        }
        return answer; 
            }
}
        
