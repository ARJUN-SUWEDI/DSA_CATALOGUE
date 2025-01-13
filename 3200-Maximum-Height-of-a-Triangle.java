class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(check(red, blue), check(blue, red));
    }

    public int check(int r, int b) {
        int i=1;
        for(i=1;;++i){
            if(i%2==0){
                if(b<i){
                    break;
                }
                b-=i;
            }
            else{
                if(r<i){
                    break;
                }
                r-=i;
            }
        }
        return i-1;
    }
}
