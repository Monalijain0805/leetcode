class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char ch : sentence.toCharArray()) {
            set.add(ch);
            if (set.size() == 26) return true; // early exit
        }
        return false;
    }
}

// class Solution {
//     public boolean checkIfPangram(String sentence) {
//         boolean[] seen = new boolean[26]; // to store if a letter is found

//         for (int i = 0; i < sentence.length(); i++) {
//             char ch = sentence.charAt(i);

//             int index = ch - 'a'; // convert 'a'→0, 'b'→1 ... 'z'→25
//             seen[index] = true;   // mark this letter as seen
//         }

//         // now check if all letters are present
//         for (int i = 0; i < 26; i++) {
//             if (seen[i] == false) {
//                 return false; // any letter missing
//             }
//         }

//         return true; // all 26 letters present
//     }
// }