class Solution {
    public boolean isHappy(int n) {
        int f=n;
        int s=n;
        do{
            f=square(square(f));
            s=square(s);
        }while(f!=s);
        return s==1;
    }
    public int square(int num){
        int answer=0;
        while(num>0){
            int rem=num%10;
            answer+=rem*rem;
            num/=10;
        }
        return answer;
    }
}