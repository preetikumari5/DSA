class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        int[] countS = new int[10];  // frequency for secret
        int[] countG = new int[10];  // frequency for guess

        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s == g) {
                bulls++;
            } else {
                countS[s - '0']++;
                countG[g - '0']++;
            }
        }

        // count cows (digits in wrong position)
        for (int d = 0; d < 10; d++) {
            cows += Math.min(countS[d], countG[d]);
        }

        return bulls + "A" + cows + "B";
    }
}
