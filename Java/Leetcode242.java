class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = t.toCharArray();
        Arrays.sort(ch);
        String st = new String(ch);
        char[] ch2 = s.toCharArray();
        Arrays.sort(ch2);
        String st2 = new String(ch2);
        
        return st.equals(st2);
    }
}
