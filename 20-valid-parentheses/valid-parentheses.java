// class Solution {
//     public boolean isValid(String str) {
//         Stack <Character> st= new Stack<>();
//         int n = str.length();
//         for(int i=0; i<n; i++){
//             char ch=str.charAt(i);
//             if(ch == '(' || ch == '{' || ch =='['){
//                 st.push(ch);
//             }
//             else{
//                 if(st.size()==0)return false;
//                 if (st.peek() == '(' && ch == ')' || 
//                     st.peek() == '{' && ch == '}' || 
//                     st.peek() == '[' && ch == ']'){
//                         st.pop();
//                 }  
//                 else {
//                     return false; //added: mismatch found
//                 }
//             }
//         }
//         if(st.size()>0)return false;
//         else return true;
//     }
// }




class Solution {
    public boolean isValid(String s) {
        String str = s; //given string hi use krni h s naki new String()
        int n= str.length();
        Stack<Character> st= new Stack<>(); //character ka stack bnana h naki int ka
        for(int i=0;i<n;i++){
            char ch = str.charAt(i); //int ch nhi , char ch bnana h
            if(ch== '(' || ch=='{' || ch=='['){
               st.push(ch);
            }
            else{
               if(st.size()==0)return false;

               if( (st.peek()=='(' && ch== '}' ) || (st.peek()=='(' && ch== ']' ))
               return false;

               if( (st.peek()=='{' && ch== ')' ) || (st.peek()=='{' && ch== ']' ))
               return false;

               if( (st.peek()=='[' && ch== '}' ) || (st.peek()=='[' && ch== ')' ))
               return false;

               st.pop();   // match krne k baad pop jruri kyuki agr match kr gya or humne pop nhi kia toh end m bracket bachega jiski wjh se size bhi zero nhi hoga
            }
        }
        if(st.size() > 0)return false;
        else return true; 
//                //OR
//         //return st.size() == 0; //end m stack empty hona jruri h
   }
    }