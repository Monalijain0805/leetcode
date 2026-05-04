// class Solution {
//     public int countKeyChanges(String s) {
//         int count = 0;
//         s = s.toLowerCase(); // convert once
//         for (int i = 0; i < s.length() - 1; i++) {
//             if (s.charAt(i) != s.charAt(i + 1)) {
//                 count++;
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int countKeyChanges(String s) {
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int diff = Math.abs(s.charAt(i) - s.charAt(i + 1));

            if (diff != 0 && diff != 32) {
                count++;
            }
        }
        return count;
    }
}