//import java.util.Scanner;
class Solution {
    public static boolean hasDuplicate(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        for(int i =0;i<nums.length;i++){
            System.out.println("Enter value of "+i+" : ");
            nums[i]=sc.nextInt();
        }
        boolean status = hasDuplicate(nums);
        if(status){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        sc.close();
    }
}