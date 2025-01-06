class Solution {
public:
    int Funct(string boxes , int i){
        vector<int> temp;
        for(int j = 0;j<boxes.length();j++){
            if(j == i) continue;
            if(boxes[j] == '1') temp.push_back(abs(j - i));
        }
        int sum = 0;
        for(int i = 0 ;i < temp.size();i++){
            sum = sum + temp[i];
        }
        return sum;
    }
    vector<int> minOperations(string boxes) {
        vector<int> ans(0,boxes.length());
        for(int i = 0 ; i< boxes.length();i++){
            ans.push_back(Funct(boxes,i));
        }
        return ans;
    }
};
