package Day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shree
 **/
public class TwoSumHashMap {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int difference = target - nums[i];
            if(numsMap.containsKey(difference)){
                return new int[] {numsMap.get(difference), i};
            }
            numsMap.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11 , 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
