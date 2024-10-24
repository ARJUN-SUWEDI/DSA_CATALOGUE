class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        /*int[] arr=new int[nums1.length];
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
        int[] ans=new int[nums1.length-cc];

        for(int i=0;i<nums1.length-cc;i++){
            ans[i]=arr[i];
        }

        return ans;
        public boolean check(int che,int[] arr){
        int c=0;
        for(int i=0;i<arr.length;++i){
            if(arr[i]==che){
                c++;
            }
        }
        return c==0;
    }*/
        boolean[] ch=new boolean[1001];
        for(int i=0;i<nums1.length;++i){
            ch[nums1[i]]=true;
        }   
        int c=0;
        for(int i=0;i<nums2.length;++i){
            if(ch[nums2[i]]){
                nums1[c++]=nums2[i];
                ch[nums2[i]]=false;
            }
        }
        int[] result=new int[c];
        for(int i=0;i<c;++i){
            result[i]=nums1[i];
        }
        return result;
    }
    
}