class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int n = s.length();
        String a = s.substring(0, n/2);
        String b = s.substring(n/2);
        int c1 = 0, c2 = 0;

        for(char ch : a.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                c1++;
            }
        }
        for(char ch : b.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                c2++;
            }
        }
        return c1 == c2;
    }
}
