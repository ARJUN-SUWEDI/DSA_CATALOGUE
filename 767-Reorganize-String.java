import java.util.*;

class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((ch1, ch2) -> map.get(ch2) - map.get(ch1));
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(entry.getKey());
        }

        String ans = "";
        for (int i = 0; i < s.length(); ++i) {
            char ch = pq.poll();
            if (i == 0 || ch != ans.charAt(ans.length() - 1)) {
                ans += ch;
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) > 0) {
                    pq.add(ch);
                }
            } else {
                if (pq.isEmpty()) {
                    return "";
                }
                char nextCh = pq.poll();
                ans += nextCh;
                map.put(nextCh, map.get(nextCh) - 1);
                if (map.get(nextCh) > 0) {
                    pq.add(nextCh);
                }
                pq.add(ch);
            }
        }

        return ans;
    }
}
