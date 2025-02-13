class Solution {
    public long[] sumOfThree(long num) {
        long [] ans=new long[3];
        long dummy=num/3;
        if(dummy*3==num){
            return new long[]{dummy-1,dummy,dummy+1};
        }
        return new long[]{};

    }
}