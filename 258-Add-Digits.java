class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int count=0;
        return add(num,count);
    }
    public static int add(int n, int c){
        
        if(n<10){
            return n;
        }
        c++;
        int s=0;
        while(n>0){
            s=s+(n%10);
            n=n/10;
        }
        return add(s,c);
    }
}