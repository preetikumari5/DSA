class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        while(a!=0 || b!=0 || c!=0){
            if((c&1) == 1){
                if((b&1) == 0 && (a&1) ==0) flips++;
            }
            else{
                if((b&1) == 1)  flips++;
                if((a&1) == 1)  flips++;
            }
            a = a>>1;
            b = b>>1;
            c = c>>1;
        }
        return flips;
    }
}