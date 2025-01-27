class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        HashSet<Character> set=new HashSet<>();
        int count =0;
        int l=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();++i){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
                count--;
            }
            set.add(s.charAt(i));
            count++;
            max=Math.max(count,max);
        }
        max=Math.max(count,max);
        return max;
    }
}