class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        // store answer
        List<Integer> ans = new ArrayList<>();

        // check every word
        for (int i = 0; i < words.length; i++) {

            // check every character
            for (int j = 0; j < words[i].length(); j++) {

                // if character matches
                if (words[i].charAt(j) == x) {

                    // add index
                    ans.add(i);

                    // stop for current word
                    break;
                }
            }
        }

        return ans;
    }
}