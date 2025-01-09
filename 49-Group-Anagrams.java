import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> list = new HashMap<>();
        
        for (String s : strs) {
            int[] freq = new int[26];
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }
            
            String key = Arrays.toString(freq);
            
            list.putIfAbsent(key, new ArrayList<>());
            list.get(key).add(s);
        }
        
        return new ArrayList<>(list.values());
    }
}
