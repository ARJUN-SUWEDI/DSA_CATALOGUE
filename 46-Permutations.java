class Solution {
    static   List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
       ans = new ArrayList<List<Integer>>();
        List<Integer> p = new ArrayList<Integer>();
      generatePer(nums,n,new ArrayList<Integer>());
      return ans;

    }
    public static void  generatePer(int nums[],int n,   List<Integer> p){
        if(p.size() == n){
            List<Integer> a =new ArrayList<>(p);
            ans.add(a);
            return ;
        }
        for(int i=0; i<n; i++){
            if(p.contains(nums[i]) == false){
                p.add(nums[i]);
                generatePer(nums,n,p);
                p.remove(p.size()-1);
            }
        }
    }
}