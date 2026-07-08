class Solution {
    public int removeElement(int[] nums, int val) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) nums[i] = Integer.MAX_VALUE;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == Integer.MAX_VALUE) {
                break;
            }
            count++;
        }


        return count;
    }
}