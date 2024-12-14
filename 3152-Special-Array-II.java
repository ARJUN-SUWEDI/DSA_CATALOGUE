class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
         boolean res[]=new boolean[queries.length];
        ArrayList<Integer> lst=new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]%2==nums[i+1]%2){
                lst.add(i+1);
            }
        }
        Collections.sort(lst);
        // mereko check krni pdegi ki voh exist krni padegi
       for (int i = 0; i < queries.length; i++) {
        int st=0;
        int end=lst.size()-1;// agar mere arraylist ke andar payi jati hai
        boolean isSpecial=true;
        while (st<=end) {
            int mid=(st+end)/2;
            if(lst.get(mid)>queries[i][0] && lst.get(mid)<=  queries[i][1]){
                isSpecial=false;
                break;
            }//jahir se 
            else if (lst.get(mid)>=queries[i][1]) {
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        res[i]=isSpecial;
       }
       return res;
    }
}