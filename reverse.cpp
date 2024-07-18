#include <iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int rev = 0;
    while(n>0)
    {
        int r = n%10;
        rev = rev*10 + r;
        n = n/10;
    }
    cout<<rev;
    return 0;
}



// including negative numbers and 32-bit limit
// class Solution {
// public:
//     int reverse(long x) {
//         long rev = 0;
//         long r;
//         if(x>0)
//         {
//             while(x>0)
//             {
//                 r = x%10;
//                 rev = rev*10 + r;
//                 x = x/10;
//             }
//         }
//         else
//         {
//             x = -x;
//             while(x>0)
//             {
//                 r = x%10;
//                 rev = rev*10 + r;
//                 x = x/10;
//             }
//             rev = -rev;
//         }
//         if(rev > 2147483647 || rev < -2147483648)
//         {
//             return 0;
//         } 
//         return rev;
//     }
// };