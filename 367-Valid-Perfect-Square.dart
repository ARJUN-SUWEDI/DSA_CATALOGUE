class Solution {
  bool isPerfectSquare(int num) {
    for(int i=1;i<=num;i++){
        if(i*i==num.abs()){
            return true;
        }
    }
    return false;
  }
}