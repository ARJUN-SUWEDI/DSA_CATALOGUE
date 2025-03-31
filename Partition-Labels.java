class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        Integer[] lastOccurance = new Integer[26];
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i=0; i<n; i++){
            lastOccurance[arr[i]-'a'] = i; 
        }
        
        int st=0, end = 0;
        for(int index = 0; index < n; index++){
            if(index > end){
                // End of previous substring
                res.add(end-st+1);

                // Repeat process for next char
                st = index;
                end = lastOccurance[arr[index]-'a'];
            }
            end = Math.max(end, lastOccurance[arr[index]-'a']);
        }
        res.add(end-st+1);
        return res;
    }
}