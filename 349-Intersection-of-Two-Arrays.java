class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int a=0;
        int b=0;
        if(nums1.length<=nums2.length){
            a=nums2.length;
            b=nums1.length;
        }
        else {
            a=nums1.length;
            b=nums2.length;
        }
        int[] arr=new int[b];
        Arrays.fill(arr, -1);
        int c=0;
        for(int i =0;i<nums1.length;++i){
            for(int j=0;j<nums2.length;++j){
                if(check(nums2[j],arr)){
                    if(nums1[i]==nums2[j]){
                    arr[c]=nums1[i];
                    c++;
                }
                }
            }
        }
        int cc=0;
        
        for(int i=0;i<arr.length;++i){
            if(arr[i]==-1 ){
                cc++;
            }
        }
        int[] ans=new int[b-cc];

        for(int i=0;i<b-cc;i++){
            ans[i]=arr[i];
        }

        return ans;
    }
    public boolean check(int che,int[] arr){
        int c=0;
        for(int i=0;i<arr.length;++i){
            if(arr[i]==che){
                c++;
            }
        }
        return c==0;
    }
}