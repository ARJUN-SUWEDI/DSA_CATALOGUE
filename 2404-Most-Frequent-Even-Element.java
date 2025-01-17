class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                if(map.containsKey(n)){
                    map.put(n, map.get(n) + 1);
                }
                else{
                    map.put(n, 1);
                }
            }
        }

        int max = -1;
        int res = -1;
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (freq > max || (freq == max && key < res)) {
                max = freq;
                res = key;
            }
        }
        return res;
    }
}
//frequency array approach or counting sort
//     public int mostFrequentEven(int[] nums) {
//         int freq[]= new int[100001];
//         for(int i=0;i<nums.length;++i){
//             if(nums[i]%2==0){
//                 freq[nums[i]]++;
//             }
//         }
//         return check(nums)?max(freq):-1;
        
//     }
//     public boolean check(int[] arr){
//         for(int n:arr){
//             if(n%2==0){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public int max(int []arr){
//         int max=-1;
//         int idx=-1;
//         for(int i=0;i<arr.length;i+=2){
//             if(max<arr[i]){
//                 max=arr[i];
//                 idx=i;
//             }
//         }
//         return max==-1?-1:idx;
//     }
// }