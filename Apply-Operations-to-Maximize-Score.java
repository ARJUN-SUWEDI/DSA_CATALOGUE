class Solution {
    int mod=1000000007;
    public int maximumScore(List<Integer> nums, int k) {
        int n=nums.size();
        int[] score=new int[n];
        List<Integer> prime=sieve(Collections.max(nums));
        for(int i=0;i<n;i++){
            int num=nums.get(i);
            for(int p:prime){
                if(p*p>num) break;
                if(num%p!=0) continue;
                score[i]++;
                while(num%p==0){
                    num/=p;
                }
            }
            if(num>1) score[i]++;
        }
        int[] prev=new int[n];
        int[] next=new int[n];
        Arrays.fill(prev,-1);
        Arrays.fill(next,n);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && score[st.peek()]<score[i]){
                int ind=st.pop();
                next[ind]=i;
            }
            if(!st.isEmpty()){
                prev[i]=st.peek();
            }
            st.push(i);
        }
        long[] sub=new long[n];
        for(int i=0;i<n;i++){
            sub[i]=(long)(next[i]-i)*(i-prev[i]);
        }
        List<int[]> sorted=new ArrayList<>();
        for(int i=0;i<n;i++){
            sorted.add(new int[]{nums.get(i),i});
        }
        sorted.sort((a,b)->Integer.compare(b[0],a[0]));
        long ans=1;
        int pro_ind=0;
        while(k>0){
            int[] ele=sorted.get(pro_ind++);
            int num=ele[0];
            int index=ele[1];
            long op=Math.min(k,sub[index]);
            ans=(ans*power(num,op))%mod;
            k-=op;
        }
        return (int)ans;
    }
    public long power(long b,long e){
        long res=1;
        while(e>0){
            if(e%2==1){
                res=(res*b)%mod;
            }
            b=(b*b)%mod;
            e/=2;
        }
        return res;
    }
    public List<Integer> sieve(int n){
        int[] ans = new int[n+1];
		ans[0] = ans[1] = 1;
		for (int i = 2; i * i <= ans.length; i++) {
			if (ans[i] == 0) {
				for (int j = 2; i * j < ans.length; j++) {
					ans[i * j] = 1;
				}
			}
		}
        List<Integer> primes=new ArrayList<>();
		int c=0;
		for (int i = 2; i < ans.length; i++) {
			if(ans[i]==0) {
				primes.add(i);
			}
		}
		return primes;
    }
}