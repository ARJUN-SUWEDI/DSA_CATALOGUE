class Solution {
    public String repeatLimitedString(String s, int limit) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(char c: s.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        PriorityQueue<Character> pq= new PriorityQueue<>((a,b)->b-a);
        for(char k: map.keySet()) pq.offer(k);
        StringBuilder sb= new StringBuilder();
        while(!pq.isEmpty()){
            char c=pq.poll();
            int count=map.get(c);
            if(count<=limit){
                for(int i=0;i<count;++i) sb.append(c);
                map.remove(c);
            }
            else{
                for(int i=0;i<limit;++i) sb.append(c);
                map.put(c,map.get(c)-limit);
                if(pq.isEmpty()) return sb.toString();
                char next=pq.poll();
                sb.append(next);
                map.put(next,map.get(next)-1);
                if(map.get(next)==0) map.remove(next);
                if(map.containsKey(next)) pq.offer(next);
                pq.offer(c);
            }
        }
        return sb.toString();
    }
}