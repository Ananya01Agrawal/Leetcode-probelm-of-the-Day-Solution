class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> char_map = new HashMap();
        Map<String, Character> word_map = new HashMap();
        
        int n = pattern.length(), i = 0;
        String[] words = str.split(" ");
        if(n != words.length) return false;
        
        while(i < n){
            char c = pattern.charAt(i);
            String word = words[i];
            if(char_map.containsKey(c) != word_map.containsKey(word)) return false;
            if(char_map.containsKey(c)){
                if( (word_map.get(word) != c) || !(char_map.get(c).equals(word)) ) return false;
            } else {
                char_map.put(c, word);
                word_map.put(word, c);
            }
            i++;
        }
        return i == n;
    }
}
