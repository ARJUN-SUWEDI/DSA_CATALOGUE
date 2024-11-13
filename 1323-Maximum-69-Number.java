class Solution {
    public int maximum69Number (int num) {
        int max=num;
        int add=3;
        int n=num;
        while(num>0){
            int rem=num%10;
            if(rem==9){
                add=add*10;
                num/=10;   
                continue;
            }
            else{
                n+=add;
            }
            max=max>n?max:n;
            n-=add;
            add=add*10;
            num/=10;
        }
        return max;
    }
}