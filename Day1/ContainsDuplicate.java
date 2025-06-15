package Day1;

/**
 * @author shree
 **/
import java.util.*;
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        if(nums==null || nums.length<=1){
            return false;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
}
