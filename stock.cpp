// leetcode - 121

class Solution {
public:
    int maxProfit(vector<int>& prices) {
    int maxProfit = 0;
    int n = prices.size();
    int minPrice = INT_MAX;

    for (int i = 0; i < n; i++) {
        minPrice = min(minPrice, prices[i]);
        maxProfit = max(maxProfit, prices[i] - minPrice);
    }
    
    return maxProfit;
    }
};