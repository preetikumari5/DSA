class Solution {
    public boolean isVowel(char ch){
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int c1 = 0, c2 = 0;
        int i=0,j=n/2;
        while(i<n/2 && j<n){
            if(isVowel(s.charAt(i))) c1++;
            if(isVowel(s.charAt(j))) c2++;
            i++;
            j++;
        }
        return c1 == c2;
    }
}
