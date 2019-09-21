class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        return search(nums, target, low, high);
    }
    
    private int search(int[] nums, int target, int low, int high) {
        int mid = (low + high)/2;
        
        // key not present
        if(low > high) {
            return -1;
        }
        
        // Key is found
        if(nums[mid] == target) {
            return mid;
        }
        
        // if left half is sorted
        if(nums[low] <= nums[mid]) {
            // if key is present in left half.
            if(nums[low] <= target && nums[mid] >=target) {
                return search(nums, target, low, mid-1);
            }else{
                // if key is not present in left half. Search the right half
                return search(nums, target, mid+1, high);
            }
        }
        // if right half is sorted
        else {
            
            // if key is present in right half.
            if(nums[mid] <= target && nums[high] >=target) {
                return search(nums, target, mid+1, high);
            }else{
                // if key is not present in right half. Search the left half
                return search(nums, target, low, mid-1);
            }
        }
    }
}
