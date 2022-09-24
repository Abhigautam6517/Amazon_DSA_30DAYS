import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int max = 0;
        Set<Character> set = new HashSet();
        
        while(r<s.length()){
            char c = s.charAt(r);
            if(set.add(c)){
                max = Math.max(max,r-l+1);
                r++;

            }
            else{
                while(s.charAt(l)!=c){
                    set.remove(s.charAt(l));
                    l++;

                }
                set.remove(c);
                l++;

            }

        }
        return max;
        
    } 
    
}
