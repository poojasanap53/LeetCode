class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean result = true;
        
        if (sentence.length() < 26) {
			result = false;
        }
		for (char i = 'a'; i <= 'z'; i++) {
			if (sentence.indexOf(i) == -1) {
				result = false;
			}
		}
		return result;
    }
}