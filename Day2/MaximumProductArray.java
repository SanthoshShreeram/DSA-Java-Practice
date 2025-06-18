package Day2;

/**
 * @author shree
 **/
public class MaximumProductArray {
    public static int maxProduct(int[] nums){
        if(nums == null || nums.length==0){
            return 0;
        }
        int currentMax = nums[0], currentMin = nums[0], globalMax = nums[0];
        for(int i=1;i< nums.length;i++){
            int temp = currentMax;
            currentMax = Math.max(nums[i], Math.max(nums[i]*temp, nums[i]*currentMin ));
            currentMin = Math.min(nums[i], Math.min(nums[i]*temp, nums[i]*currentMin ));
            globalMax = Math.max(globalMax, currentMax);
        }
        return globalMax;
    }
    public static void main(String[] args){
        int[] nums = {-2,3,-4};
        System.out.println(maxProduct(nums));
    }
}
