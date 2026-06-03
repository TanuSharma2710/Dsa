// import java.util.Scanner;
// class Solution {
//     public int removeDuplicates(int[] nums) {
//        int prev=0;
//        for(int i=1;i<nums.length;i++){
//         if(nums[i]==nums[prev]){
//             continue;
//         }
//         prev++;
//         int temp=nums[i];
//         nums[i]=nums[prev];
//         nums[prev]=temp;
//        }
//        return prev+1;
//     }
// }



class Solution {
    public int removeDuplicates(int[] nums) {
        int prev=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[prev]){
                prev++;
                int temp=nums[i];
                nums[i]=nums[prev];
                nums[prev]=temp;
            }
        }
        return prev+1;
    }
}        