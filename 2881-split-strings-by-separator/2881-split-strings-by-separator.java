class Solution {
  public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            StringBuilder currentWord = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (c != separator) {
                    currentWord.append(c);
                } else {
                    if (currentWord.length() > 0) {
                        result.add(currentWord.toString());
                        currentWord = new StringBuilder();
                    }
                }
            }
            if (currentWord.length() > 0) {
                result.add(currentWord.toString());
            }
        }
        
        return result;
    }
}