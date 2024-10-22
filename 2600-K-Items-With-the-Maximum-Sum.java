class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(numOnes>=k){
            return k;
        }
        else if(numOnes<k){
            k=k-numOnes;
            if(k>=numZeros){
                k=k-numZeros;
                if(k==0){
                    return numOnes;
                }
                if(k<=numNegOnes){
                    return numOnes-k;
                }
            }
            else{
                return numOnes;
            }
        }
        return k;
    }
}