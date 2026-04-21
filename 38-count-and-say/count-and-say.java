// class Solution {
//     public String countAndSay(int n) {
//         if (n == 1) return "1";

//         String s = countAndSay(n - 1);
//         String ans = ""; 

//         int i = 0;     
//         int j = 0;

//         while (j < s.length()) {   // ❌ was while(i < j), which never worked
//             if (s.charAt(i) == s.charAt(j)) {
//                 j++;
//             } 
//             else {
//                 int length = j - i;
//                 ans = ans + length;
//                 ans = ans + s.charAt(i);
//                 i = j;
//             }
//         }

//         int length = j - i;
//         ans = ans + length;
//         ans = ans + s.charAt(i);

//         return ans;
//     }
// }


class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String s = countAndSay(n - 1)+ "#";//modify this
        String ans = ""; 

        int i = 0;     
        int j = 0;

        while (j < s.length()) {   // ❌ was while(i < j), which never worked
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } 
            else {
                int length = j - i;
                ans = ans + length;
                ans = ans + s.charAt(i);
                i = j;
            }
        }

        // int length = j - i;
        // ans = ans + length;
        // ans = ans + s.charAt(i);

        return ans;
    }
}

