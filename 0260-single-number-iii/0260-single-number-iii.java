import java.util.Arrays;
class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int []arr=new int[2];
        int index = 0;
        for(int i=0;i<nums.length;i++){
        if ((i == nums.length - 1 || nums[i] != nums[i + 1]) && (i == 0 || nums[i] != nums[i - 1])) {
 {
                arr[index++] = nums[i];
                if (index == 2) {
                    break;
                }

            }
        }
    }
                return arr;

}}