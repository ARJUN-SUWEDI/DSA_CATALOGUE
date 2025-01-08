class Solution {
    public List<List<Integer>> ans=new ArrayList<>();
    public void combination(int[] arr, int index, int target, List<Integer> l){
        if(target==0){
            ans.add(new ArrayList<Integer>(l));
            return;
        }if(target<0||index==arr.length){
            return;
        }

        //donot pick
        combination(arr,index+1,target,l);

        //pick
        l.add(arr[index]);
        combination(arr,index,target-arr[index],l);

        l.remove(l.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combination(candidates,0,target,new ArrayList<Integer>());
        return ans;
    }
}