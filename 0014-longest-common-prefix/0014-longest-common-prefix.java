class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = commonPrefixOfTwoStr(prefix, strs[i]);
        }

        return prefix;
    }

    public String commonPrefixOfTwoStr(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        for (int j = 0; j < minLength; j++) {
            if (s1.charAt(j) != s2.charAt(j)) {
                return s1.substring(0, j);
            }
        }
        return s1.substring(0, minLength);
    }
}