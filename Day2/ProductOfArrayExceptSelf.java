package Day2;

/**
 * @author shree
 **/
public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums){
        int[] result = new int[nums.length];
        int preProduct = 1;
        for(int i=0;i<nums.length;i++){
            result[i]=preProduct;
            preProduct*=nums[i];
        }
        int postProduct = 1;
        for(int i=nums.length-1;i>=0;i--){
            result[i]*=postProduct;
            postProduct*=nums[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf(nums);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
