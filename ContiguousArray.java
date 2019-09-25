class Solution {
    public int findMaxLength(int[] nums) {
        int maxlen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            count = count + (nums[i]==1? 1: -1);
            if(map.containsKey(count)){
                maxlen = Math.max(maxlen,i-map.get(count));
            }
            else {
                map.put(count,i);
            }
        }
        //BRUTE FORCE
        // for(int start=0;start<nums.length;start++){
        //     int zeroes = 0, ones = 0;
        //     for(int end= start;end<nums.length;end++){
        //         if(nums[end] == 0){
        //             zeroes++;
        //         } else {
        //             ones++;
        //         }
        //         if(zeroes == ones) {
        //             maxlen = Math.max(maxlen, end-start+1);
        //         }
        //     }
        // }
        return maxlen;
    }
}
