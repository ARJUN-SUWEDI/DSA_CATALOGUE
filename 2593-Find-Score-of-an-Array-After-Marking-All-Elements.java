class Solution {
    public long findScore(int[] nums) {
        long result = 0;
        int length = nums.length;
        boolean[] mark = new boolean[length];
        int[][] arr = new int[length][2];

        for(int i = 0; i < length; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        for(int[] a : arr){
            int minValue = a[0];
            int minValueIndex = a[1];
            
            if(!mark[minValueIndex]){
                result += minValue;

                mark[minValueIndex] = true;
            
                if(minValueIndex < length - 1){
                    mark[minValueIndex + 1] = true;
                }
                if(minValueIndex > 0){
                    mark[minValueIndex - 1] = true;
                }
            } 
        }
        return result;
    }
}