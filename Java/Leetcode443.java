class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int index = 0;
        while(i<n){
            char curr = chars[i];
            int count = 0;

            while(i<n && chars[i]==curr){
                i++;
                count++;
            }

            chars[index++] = curr;
            if(count>1){
                String str = Integer.toString(count);
                for(char c:str.toCharArray()){
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}