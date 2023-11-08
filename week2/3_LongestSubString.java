import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, max = 0;
        while(j < s.length()){
            char temp = s.charAt(j);
            if(!set.contains(temp)){
                set.add(temp);
                j++;
                max = Math.max(max, set.size());
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}