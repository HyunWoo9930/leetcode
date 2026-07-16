class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int index = 0;
        if(nums.length == 1) {
            return nums[0];
        }
        for(int i = 1; i < nums.length; i++) {
            if(nums[index] != nums[i]) {
                index = i;
                if(count > nums.length/2) {
                    System.out.println(count);
                }
                else {
                    count=1;
                }
            }
            else {
                if(++count > nums.length/2) {
                    return nums[i];
                }
            }
    }
            return 0;
    }
}
