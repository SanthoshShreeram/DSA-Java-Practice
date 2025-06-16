package Day2;

/**
 * @author shree
 **/
public class MaxDifferenceBtwIncreasingElements {
    public static int maxDifference(int[] nums){
        if(nums==null || nums.length==0){
            return -1;
        }
        int maxDiff=-1, min = nums[0];
        for(int i=0;i<nums.length;i++){
            if(min<nums[i]){
                maxDiff = Math.max(maxDiff, (nums[i]-min));
            }
            else{
                min=nums[i];
            }
        }
        return maxDiff;
    }

    public static void main(String[] args){
        int[] nums = {1,5,2,10};
        int result = maxDifference(nums);
        System.out.println(result);
    }
}
