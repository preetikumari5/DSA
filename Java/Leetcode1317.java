class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[] = new int[2];
        for (int i = 1; i < n; i++) {
            int a = i;
            int b = n-i;
            if(isZero(a)==false && isZero(b)==false){
                arr[0] = a;
                arr[1] = b;
            }
        }
        return arr;
    }
    public boolean isZero(int n){
        while(n>0){
            int ld = n%10;
            if(ld==0) return true;
            n = n/10;
        }
        return false;
    }
}