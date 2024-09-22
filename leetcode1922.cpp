// count good numbers


// using recursion
class Solution {
public:
    int M = 1e9+7;
    long long power(long long b,long long e,long long ans){
        if(e==0) return ans;
        // e is odd
        if(e&1) return power(b,e-1,(ans*b)%M);
        // e is even
        else return power((b*b)%M , e/2 , ans);
    }
    int countGoodNumbers(long long n) 
    {
        long long temp = power(20,n/2,1);
        return (n&1) ? (temp*5)%M : temp;
    }
};

// using iteration

class Solution {
public:
    int M = 1e9+7;

    // Iterative function to calculate (base^exp) % M
    long long power(long long base, long long exp) {
        long long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {  // If the exponent is odd
                result = (result * base) % M;
            }
            base = (base * base) % M;  // Square the base
            exp /= 2;  // Halve the exponent
        }
        return result;
    }

    int countGoodNumbers(long long n) {
        long long evenIndices = (n + 1) / 2;  // Number of even index digits
        long long oddIndices = n / 2;  // Number of odd index digits

        long long evenPower = power(5, evenIndices);  // 5 options for even indices
        long long oddPower = power(4, oddIndices);    // 4 options for odd indices

        return (evenPower * oddPower) % M;  // Final result modulo M
    }
};