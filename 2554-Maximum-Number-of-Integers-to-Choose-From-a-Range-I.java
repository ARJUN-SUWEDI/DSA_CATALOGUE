class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int x=1;
        int sum=0;
        int c=0;
        HashSet<Integer> bannedSet = new HashSet<>();
        for (int num : banned) {
            bannedSet.add(num);
        }
        while(x<=n){
            if(maxSum<0)break;
            if(bannedSet.contains(x)){
                x++;
                continue;
            }
            maxSum-=x;
            if(maxSum>=0)c++;
            x++;
        }
        return c;
    }
}