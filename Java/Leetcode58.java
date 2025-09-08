class Solution {
    public int lengthOfLastWord(String s) {
        int l = 0;
        int i = s.length() - 1;

        // 1. Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // 2. Count length of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            l++;
            i--;
        }

        return l;
    }
}
