package LeetCode;

import java.util.Arrays;

public class ValidAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            char[] schars = s.toCharArray();
            char[] tchars = t.toCharArray();
            Arrays.sort(schars);
            Arrays.sort(tchars);
            if(Arrays.equals(schars, tchars)){
                return true;
            };
            return false;
        }
    }    
}
