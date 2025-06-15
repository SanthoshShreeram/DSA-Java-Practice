package Day1;

/**
 * @author shree
 **/
public class MaximumSubarray {
    public static int maxSubArray(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        int globalMax=nums[0], currentMax=nums[0];
        for(int i=0;i<nums.length;i++){
            currentMax = Math.max(nums[i], nums[i]+currentMax);
            globalMax = Math.max(globalMax, currentMax);
        }
        return globalMax;
    }
    public static void main(String[] args){
        int[]nums ={-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = maxSubArray(nums);
        System.out.println(maxSum);
    }
}
