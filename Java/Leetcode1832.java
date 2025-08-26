class Solution {
    public boolean checkIfPangram(String s) {
        Set<Character> set = new HashSet<>();

        for(char ch:s.toCharArray()){
            if(ch>='a' && ch <='z')
                set.add(ch);
        }

        return set.size() == 26;
    }
}
