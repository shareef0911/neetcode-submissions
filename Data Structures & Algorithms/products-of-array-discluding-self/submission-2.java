class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] arr = new int[nums.length];

        // Store product of elements to the left
        int left = 1;

        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }

        // Multiply by product of elements to the right
        int right = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }

        return arr;
    }
}