class Solution {
    public int[] constructRectangle(int area) {
        int[] r = new int[2];
        int l = 0;
        int w = 0;
        for(int i=1;i<=area;i++){
            w = i;
            l = area/i;
            if(w*l==area && l>=w){
                r[0] = l;
                r[1] = w;
            }
        }
        return r;
    }
}