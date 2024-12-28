class Solution {
public:
    int maximumPopulation(vector<vector<int>>& logs) {
        vector<int> population(101, 0); 
        for (const auto& log : logs) {
            population[log[0]-1950] += 1;   // Increment for birth year
            population[log[1]-1950] -= 1;   // Decrement for death year
        }

        int maxp = 0;
        int max=0;
        int currp= 0;
        for (int i=0; i<101; ++i) {
            currp +=population[i];  // Add population change
            if (currp>maxp) {
                maxp = currp; 
                max=i;                    
            }
        }

        return max+1950; 
    }
};
