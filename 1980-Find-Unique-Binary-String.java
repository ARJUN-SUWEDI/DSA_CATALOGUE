class Solution {
    public String findDifferentBinaryString(String[] nums) {
         HashSet<String> list = new HashSet<>(Arrays.asList(nums));

         StringBuilder build = new StringBuilder();
        
         for(int i=0; i<nums.length; i++ ){
             if(i<nums[i].length()){
                 char x=nums[i].charAt(i);
                 build.append(x == '0' ? '1' : '0'); 
             }
         }
        
         String diff_binary = build.toString();

         return diff_binary;
    }
}