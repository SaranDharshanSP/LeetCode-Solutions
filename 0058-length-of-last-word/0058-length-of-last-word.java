class Solution {
    public int lengthOfLastWord(String s) {
            String[] arrayOfWords = s.split(" ");
            if (arrayOfWords.length == 0) {
                return 0;
            }
            String lastWord = arrayOfWords[arrayOfWords.length - 1];
            return lastWord.length();
        }
}