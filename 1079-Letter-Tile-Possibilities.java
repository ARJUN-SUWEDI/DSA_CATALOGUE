class Solution {
    public int numTilePossibilities(String tiles) {
        int arr[]=new int[26];
        for(char c:tiles.toCharArray()){
            arr[c-'A']++;
        }
        return ans(arr);
    }
    public int ans(int[] arr){
        int a=0;
        for(int i=0;i<26;++i){
            if(arr[i]==0){
                continue;
            }
            arr[i]--;
            a+=1+ans(arr);
            arr[i]++;
        }
        return a;
    }
}