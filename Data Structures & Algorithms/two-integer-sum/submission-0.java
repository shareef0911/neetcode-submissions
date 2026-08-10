class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr= new int[2];
        int m =0;
        boolean status = false;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1 ;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    arr[m++] =i;
                    arr[m] =j;
                    status = true;
                    break;
                }
            }
            if(status){
                break;
            }
        }
        return arr;
    }
}
