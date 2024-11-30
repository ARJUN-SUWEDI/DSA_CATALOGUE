class Solution {
 public void solvedfs(HashMap<Integer, ArrayList<Integer>> adj, int start, ArrayList<Integer> res) {
    while (adj.get(start) != null && !adj.get(start).isEmpty()) {
        int next = adj.get(start).remove(0); 
        solvedfs(adj, next, res);
    }
    res.add(0, start); 
}
    public int[][] validArrangement(int[][] pairs) 
    {
        HashMap<Integer,ArrayList<Integer>>adj=new HashMap<>();
        HashMap<Integer,Integer>indegree=new HashMap<>();
        HashMap<Integer,Integer>outdegree=new HashMap<>();

        for (int[] pair : pairs) {
            int from = pair[0];
            int to = pair[1];

            adj.putIfAbsent(from, new ArrayList<>());
            adj.putIfAbsent(to, new ArrayList<>());

            adj.get(from).add(to);

            outdegree.put(from, outdegree.getOrDefault(from, 0) + 1);
            indegree.put(to, indegree.getOrDefault(to, 0) + 1);
        }
        int start=pairs[0][0];
        for(Map.Entry<Integer,ArrayList<Integer>>map:adj.entrySet())
        {
            int node=map.getKey();
           if (outdegree.getOrDefault(node, 0) - indegree.getOrDefault(node, 0) == 1)
            {
                start=node;
                break;
            }
        }

        ArrayList<Integer>res=new ArrayList<>();
        
        solvedfs(adj,start,res);

        int ans[][]=new int[pairs.length][2];
        for(int i=0;i<res.size()-1;i++)
        {
            ans[i][0]=res.get(i);
            ans[i][1]=res.get(i+1);
        }
        return ans;        
    }
}