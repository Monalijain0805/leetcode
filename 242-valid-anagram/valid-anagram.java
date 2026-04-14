// import java.util.Arrays;
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         char[] arr=s.toCharArray();
//         char[] brr=t.toCharArray();
//         for(char ele: arr){
//             System.out.print(ele);
//         }
//         System.out.println();
//         for(char ele: brr){
//             System.out.print(ele);
//         }
//         System.out.println();
//         Arrays.sort(arr);
//         Arrays.sort(brr);
//         for(char ele: arr){
//             System.out.print(ele);
//         }
//         System.out.println();
//         for(char ele: brr){
//             System.out.print(ele);
//         }
//         System.out.println();
//         if (Arrays.equals(arr, brr)) {
//             return true;
//         }
//         else {
//             return false;
//         }
//     }
// }




// import java.util.Arrays;

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         // If lengths are different, they can't be anagrams
//         if (s.length() != t.length()) return false;

//         char[] arr = s.toCharArray();
//         char[] brr = t.toCharArray();

//         Arrays.sort(arr);
//         Arrays.sort(brr);

//         return Arrays.equals(arr, brr);
//     }
// }


//OPTIMAL SOLTUION USING HASHMAP
 
import java.util.HashMap;
class Solution{
    public boolean isAnagram(String s, String t){
        // Fix 1: length check
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();  //character and integer ka bnaya kyukiek character store hogaor uski frequency isliye int
        for(int i = 0; i<s.length() ; i++){ //poore word m loop chlaege 
            char ch = s.charAt(i); //hr ek word ko char ch m dege
            if(map1.containsKey(ch)){  //check krege agr vo  particular letter map m h ki nhii
                int freq = map1.get(ch);
                map1.put(ch, freq+1);
            }
            else{
                map1.put(ch, 1);
            }
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0; i<t.length() ; i++){
            char ch = t.charAt(i);
            if(map2.containsKey(ch)){
                int freq = map2.get(ch);
                map2.put(ch, freq+1);
            }
            else{
                map2.put(ch, 1);
            }
        }
        for(int i =0 ;i<s.length();i++){
            char key= s.charAt(i);
            // Fix 2: correct condition
            if(!map2.containsKey(key)) return false;//iska mtlb agr t  name ki koi stirng h hi nhi
            if(map1.get(key).intValue() != map2.get(key).intValue()) return false;
            //.intValue() - isliye kia kyuki map1ki values comapre krni h actual
        }
        return true;
    }
}