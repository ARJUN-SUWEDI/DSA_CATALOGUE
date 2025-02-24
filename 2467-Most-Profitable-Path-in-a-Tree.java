class Solution {
    List<List<Integer>> adjList=new ArrayList<>();
    Map<Integer,Integer> bobReachTime=new HashMap<>();
    int maxIncome=Integer.MIN_VALUE;

    public void dfsAlice(int curr,boolean[] visited,int income,int time,int[] amount) {
        visited[curr]=true;

        if (bobReachTime.containsKey(curr)) {
            if (time == bobReachTime.get(curr)) {
                income += (amount[curr]/2);
            } else if (time < bobReachTime.get(curr)) {
                income += amount[curr];
            } else if (time > bobReachTime.get(curr)) {
                income += 0;
            }
        } else {
            income += amount[curr];
        }

        //if it is leaf node and not equals to 0
        if (adjList.get(curr).size()==1 && curr!=0) {
            maxIncome=Math.max(maxIncome,income);
        }

        for (int ngbr: adjList.get(curr)) {
            if (!visited[ngbr])
                dfsAlice(ngbr,visited,income,time+1,amount);
        }
    }

    public boolean dfsBob(int curr,boolean[] visited,int time) {
        visited[curr]=true;
        bobReachTime.put(curr,time);

        for (int ngbr: adjList.get(curr)) {
            if (!visited[ngbr])
                if (dfsBob(ngbr,visited,time+1))
                    return true;
        }

        if (curr==0) {
            return true;
        }

        bobReachTime.remove(curr);
        return false;
    }

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n=amount.length;
        for (int i=0;i<n;i++)
            adjList.add(new ArrayList<>());

        for (int[] e: edges) {
            int u=e[0];
            int v=e[1];

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        //mark Bob reach time for each node
        int time=0;
        boolean[] visited=new boolean[n];
        dfsBob(bob,visited,time);

        //calculate max. income at each leaf node by Alice
        int income=0;
        time=0;
        Arrays.fill(visited,false);
        dfsAlice(0,visited,income,time,amount);

        return maxIncome;
    }
}