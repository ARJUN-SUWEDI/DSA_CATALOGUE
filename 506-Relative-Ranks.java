class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] answer=new String[score.length];
        int f=0,s=0,t=0;
        for(int i=0;i<score.length;++i){
            if(score[i]>f){
                t=s;
                s=f;
                f=score[i];
            }
            else if(score[i]>s){
                t=s;
                s=score[i];
            }
            else if(score[i]>t){
                t=score[i];
            }
        }
        int[] h = Arrays.copyOf(score, score.length);
        Arrays.sort(h);

        for(int i=0;i<score.length;++i){
            if(score[i]==f){
                answer[i]=\Gold Medal\;
                continue;
            }
            else if(score[i]==s){
                answer[i]=\Silver Medal\;
                continue;
            }
            else if(score[i]==t){
                answer[i]=\Bronze Medal\;
            }
            else{
                answer[i]=String.valueOf(index(h,score[i]));
            }
        }
        return answer;
    }
    public static int index(int[] arr,int a){
        int i=0;
        for(i=0;i<arr.length;++i){
            if(arr[i]==a)break;
        }
        return arr.length-i;
    }
}