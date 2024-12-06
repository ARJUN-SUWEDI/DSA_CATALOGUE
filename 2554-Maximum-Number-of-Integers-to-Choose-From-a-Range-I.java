class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int x=1;
        int sum=0;
        int c=0;
        Arrays.sort(banned);
        HashSet<Integer> bannedSet = new HashSet<>();
        for (int num : banned) {
            bannedSet.add(num);
        }
        while(x<=n && sum<=maxSum){
            if(bannedSet.contains(x)){
                x++;
                continue;
            }
            sum=sum+x;
            if(sum<=maxSum)c++;
            x++;
        }
        return c;
    }
}