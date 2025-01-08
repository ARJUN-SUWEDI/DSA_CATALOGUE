class Solution {
    public List<List<Integer>> final_Ans= new ArrayList<>();
    public void permutated_subsets(int[] arr, int index, ArrayList<Integer> l){
        if(index==arr.length){
            final_Ans.add(new ArrayList<Integer> (l));
            return; 
        }

        //dont pick

        permutated_subsets(arr,index+1,l);

        //pick the element
        l.add(arr[index]);

        permutated_subsets(arr,index+1,l);
        //shallow_copy versus deep_copy or we can say pass by value versus pass by reference
        l.remove(l.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        permutated_subsets(nums,0,new ArrayList<Integer>());   
        return final_Ans;
    }
}