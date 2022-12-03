class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lastWordLen = words[words.length-1];
        return lastWordLen.length();
    }
}