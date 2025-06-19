package Day3;
import java.util.*;
/**
 * @author shree
 **/
public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        Set<Integer> intersectionSet = new HashSet<>();
        for(int num : nums2){
            if(set1.contains(num)){
                intersectionSet.add(num);
            }
        }
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for(int num : intersectionSet){
            result[index++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
