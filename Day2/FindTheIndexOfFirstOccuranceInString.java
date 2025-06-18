package Day2;

/**
 * @author shree
 **/
public class FindTheIndexOfFirstOccuranceInString {
    public static int findeIndex(String haystack, String needle){
        if(needle.length()==0){
            return 0;
        }
        int hlen = haystack.length();
        int nlen = needle.length();
        if(nlen>hlen){
            return -1;
        }
        for(int i=0;i<hlen-nlen;i++){
            boolean match = true;
            for(int j=0;j<nlen;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    match = false;
                    break;
                }
            }
            if(match){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "but";
        System.out.println(findeIndex(haystack, needle));
    }
}
