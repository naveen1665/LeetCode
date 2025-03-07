import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        
        Map<Character, String> charToWordMap = new HashMap<>();
        Map<String, Character> wordToCharMap = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = arr[i];
            if (charToWordMap.containsKey(ch)) {
                if (!charToWordMap.get(ch).equals(word)) {
                    return false;
                }
            } else {

                charToWordMap.put(ch, word);
            }
            
            if (wordToCharMap.containsKey(word)) {
                if (wordToCharMap.get(word) != ch) {
                    return false;
                }
            } else {
                wordToCharMap.put(word, ch);
            }
        }
        
        return true;
    }
}
