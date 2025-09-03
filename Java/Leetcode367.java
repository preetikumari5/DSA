class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0) return false;
        if(num==0 || num==1) return true;
        long left = 1, right = num;
        while(left<=right){
            long mid = left+(right-left)/2;
            long sq = mid*mid;

            if(sq==num) return true;
            else if(sq<num) left = mid+1;
            else if(sq>num) right = mid-1;
        }
        return false;
    }
}
