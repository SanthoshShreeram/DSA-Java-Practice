package Day2;

/**
 * @author shree
 **/
public class LongestSubstringWithoutRepeatingCharacters {
    public static int findMaxLength(String s){
        if(s==null || s.length()==0){
            return 0;
        }
        int[] charIndexMap  = new int[128];
        int left = 0, maxLength = 0;
        for(int right = 0; right < s.length(); right++){
            char currentChar = s.charAt(right);
            left = Math.max(left, charIndexMap[currentChar]);
            maxLength = Math.max(maxLength, right-left+1);
            charIndexMap[currentChar] = right+1;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "aaaabcc";
        System.out.println(findMaxLength(s));
    }
}
