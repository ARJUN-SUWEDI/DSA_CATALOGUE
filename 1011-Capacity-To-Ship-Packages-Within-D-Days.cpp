class Solution {
public:
    int d(int x, vector<int>& weights){
        int days=1;
        int cur=0;
        for(int i=0;i<weights.size();++i){
            if(cur+weights[i]<=x){
                cur+=weights[i];
            }
            else{
                cur=weights[i];
                days++;
            }
        }
        return days;
    }
    bool allowed(int y,vector<int>& weights,int dd){
        return d(y, weights)<=dd;
    }
    int shipWithinDays(vector<int>& weights, int days) {
        int l=*max_element(weights.begin(),weights.end());
        int r=accumulate(weights.begin(),weights.end(),0);
        if(allowed(l,weights,days)){
            return l;
        }
        else if(!(allowed(r,weights,days))){
            return -1;
        }

        while(l<r-1){
            int mid = l+(r-l)/2;
            if(allowed(mid,weights,days)){
                r=mid;
            }
            else{
                l=mid;
            }
        }
        return r;
    }
};