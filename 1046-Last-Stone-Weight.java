import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1){return stones[0];}
        if(stones.length==2){
            if(stones[0]>stones[1])return stones[0]-stones[1];
            else return stones[1]-stones[0];
        }
        for(int i=0;i<stones.length;++i){
            Arrays.sort(stones);
            int f=stones[stones.length-1];
            int s=stones[stones.length-2];
            if(f==s){
                stones[stones.length-1]=0;
                stones[stones.length-2]=0;
            }
            else{
                stones[stones.length-1]=f-s;
                stones[stones.length-2]=0;
            }
        }
        return stones[stones.length-1];

    }
}
