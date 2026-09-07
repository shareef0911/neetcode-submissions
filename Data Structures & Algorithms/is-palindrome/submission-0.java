class Solution {
    public boolean isPalindrome(String s) {
       String s1 = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        char[] c1 = s1.toCharArray();

        char[] c2 = new StringBuilder(new String(c1))
            .reverse()
            .toString()
            .toCharArray();

        return Arrays.equals(c1, c2);
        
    }
}
