package Day3;

/**
 * @author shree
 **/
public class MaximumSubarrayAverage {
    public static double maxAvg(int[] nums, int k){
        int sum=0, maxSum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum=sum;
        for(int i=k;i< nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum/k;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(maxAvg(nums, k));
    }
}
