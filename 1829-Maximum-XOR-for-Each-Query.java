class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        /*int max=0;
        int [] answer=new int[nums.length];
        for(int i=0;i<nums.length;++i){
            max=0;
            int j=0;
            while(j<(int)Math.pow(2,maximumBit)){
                int m=s(nums,j,nums.length-i);
                int a=max;
                max=m(max,m);
                if(max>a)answer[i]=j;
                ++j;
            }
        }
        for(int i=0;i<nums.length;++i)System.out.println(answer[i]);
        return answer;*/
        int a=(int)Math.pow(2,maximumBit)-1;
        int [] answer=new int[nums.length];
        int cm=0;
        for(int x:nums){
            cm^=x;
        }
        for(int i=0;i<nums.length;++i){
            answer[i]=cm^a;
            cm=cm^nums[nums.length-1-i];
        }
        return answer;
    }
    /*public static int s(int [] arr,int a,int aa){
        int sum=0;
        for(int i=0;i<aa;++i){
            sum=sum^arr[i];
        }
        return sum^a;
    }
    public static int m(int a, int b){
        if(a>b)return a;
        return b;
    }*/
}