class Solution {
    public int solution(String[] babbling) {
        String[] str = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (String word : babbling) {
            if (isValidWord(word, str)) {
                answer++;
            }
        }
        return answer;
    }
    
    private boolean isValidWord(String word, String[] str) {
        for (String s : str) {
            if (word.contains(s + s)) {
                return false;
            }
        }

        for (String s : str) {
            word = word.replace(s, " ");
        }
        
        return word.trim().isEmpty();
    }
}