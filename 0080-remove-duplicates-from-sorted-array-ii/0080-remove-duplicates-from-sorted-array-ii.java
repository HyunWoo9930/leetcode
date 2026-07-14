class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[index]) {
                if(index == 0) {
                    index++;
                    nums[index] = nums[i];
                }
                else if(nums[index - 1] != nums[index]) {
                    index++;
                    nums[index] = nums[i];
                }
            }
            else if(nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }
}