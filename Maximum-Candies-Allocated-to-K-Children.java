class Solution {
    public int maximumCandies(int[] candies, long k) {
        int maxPossiblePerKid = 0;
        for(int candy:candies)
            maxPossiblePerKid = maxPossiblePerKid > candy ? maxPossiblePerKid : candy;
        int start = 0;
        int end = maxPossiblePerKid;
        int res = 0;

        while(start<=end){
            int mid = start + (end-start)/2;
            int candiesGiven = mid;
            long kidsGiven = 0;

            for(int candiesInHeap:candies){ // how many children can get from each initital heap
                if(candiesGiven == 0){
                    kidsGiven = k;
                    break;
                }
                kidsGiven = kidsGiven + (candiesInHeap/candiesGiven);
            }

            if(kidsGiven>=k)
            {
                res = candiesGiven;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }   

        return res;

    }
}