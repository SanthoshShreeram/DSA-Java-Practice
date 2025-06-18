package Day2;

/**
 * @author shree
 **/
public class ValidAnagrams {
    public static boolean findAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] charCount = new int[26];
        for(char c : s.toCharArray()){
            charCount[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            charCount[c - 'a']--;
        }
        for(int num:charCount){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(findAnagram(s, t));
    }
}
