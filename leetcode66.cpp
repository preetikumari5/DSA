class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int n = digits.size();
        
        // Traverse the digits from the last to the first
        for(int i = n - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                // If the current digit is less than 9, just increment it and return
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and continue to the next digit
            digits[i] = 0;
        }
        
        // If all digits were 9, we need to add a 1 at the beginning
        digits.insert(digits.begin(), 1);
        return digits;
    }
};
