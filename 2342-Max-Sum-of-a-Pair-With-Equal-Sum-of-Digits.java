import java.util.*;

class Solution {
    public int maximumSum(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i : nums) {
            int sum = 0, temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            ls.add(sum);
        }
        HashMap<Integer,ArrayList<Integer>> idx=new HashMap();
        for(int i=0;i<ls.size();++i){
            int d=ls.get(i);
            idx.putIfAbsent(d,new ArrayList<>());
            idx.get(d).add(nums[i]);
        }
        int max=-1;
        for(ArrayList<Integer> val:idx.values()){
            if(val.size()>1){

                Collections.sort(val, Collections.reverseOrder());
                max=Math.max(max,val.get(0)+val.get(1));
            }
        }
        return max==-1?-1:max;
    }
}
