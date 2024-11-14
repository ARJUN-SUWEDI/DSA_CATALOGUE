class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left=1;
        int right=maximum(quantities);
        int result=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(allocated(mid,quantities,n)){
                result=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return result;
        
    }
    public boolean allocated(int max,int[] array,int n){
        int load=0;
        for(int quantity: array){
            load+=(int)Math.ceil((double)quantity/max);
            if(load>n)return false;
        }
        return true;
    }
    public int maximum(int[] array){
        int max=array[0];
        for(int iterate: array){
            if(iterate>max){
                max=iterate;
            }
        }
        return max;
    }
}