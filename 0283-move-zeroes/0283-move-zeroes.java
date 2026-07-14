class Solution {
    public void moveZeroes(int[] nums) {

        int store = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[store] = nums[i];
                store++;
            }
        }

        while (store < nums.length) {
            nums[store] = 0;
            store++;
        }
    }
}