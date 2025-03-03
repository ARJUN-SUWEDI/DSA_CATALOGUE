class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int pivotCount = 0;
		List<Integer> prePivList  = new ArrayList<>();
		List<Integer> postPivList  = new ArrayList<>();
		for(int n:nums) {
			if(n==pivot) {
				pivotCount++;
			}else if(n<pivot) {
				prePivList.add(n);
			}else {
				postPivList.add(n);
			}
		}
		while(pivotCount>0) {
			prePivList.add(pivot);
			pivotCount--;
		}
		return Stream.concat(prePivList.stream(), postPivList.stream()).mapToInt(Integer::intValue).toArray();
    }
}