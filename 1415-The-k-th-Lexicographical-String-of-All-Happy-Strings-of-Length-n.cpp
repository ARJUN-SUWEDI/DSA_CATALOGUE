class Solution {
public:
    void solve(int n, string &current, vector<string> &result) {
        if (current.size() == n) {
            result.push_back(current); // Store valid happy string
            return;
        }

        char happy[] = {'a', 'b', 'c'}; // Corrected array declaration
        for (int i = 0; i < 3; i++) {  // Simple for loop
            if (current.empty() || current.back() != happy[i]) { // Ensure no consecutive character
                current.push_back(happy[i]); // Choose
                solve(n, current, result);  // Explore
                current.pop_back(); // Undo (Backtrack) - Corrected from pop(happy[i])
            }
        }
    }

    string getHappyString(int n, int k) {
        vector<string> result;
        string current;
        solve(n, current, result); // Generate happy strings
        sort(result.begin(), result.end()); // Sort lexicographically

        if (k > result.size()) return ""; // Check if k is valid
        return result[k - 1]; // Return the k-th happy string (1-based index)
    }
};