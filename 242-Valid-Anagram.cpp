class Solution {
public:
string solve(string str) {
  sort(str.begin(), str.end());
  return str;
}
    bool isAnagram(string s, string t) {
        string a=solve(s);
        string b=solve(t);
        return a==b;
    }
};