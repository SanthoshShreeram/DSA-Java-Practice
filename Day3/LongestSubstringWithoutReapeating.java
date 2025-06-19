package Day3;
import java.util.*;
/**
 * @author shree
 **/
public class LongestSubstringWithoutReapeating {
    public static int lengthofLargestSubstring(String s){
        if(s==null || s.length()==0){
            return 0;
        }
        int left = 0, maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        for(int right=0; right<s.length(); right++){
            char currentChar = s.charAt(right);
            while(charSet.contains(currentChar)){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(currentChar);
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "aaaabcad";
        System.out.println(lengthofLargestSubstring(s));
    }
}
