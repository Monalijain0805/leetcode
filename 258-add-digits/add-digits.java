class Solution {
   public int addDigits(int num) {
        while(num>9){
            int ans=0;
            int lastdigit;

            while(num!=0){
                lastdigit=num%10;
                num=num/10;
                ans=ans+lastdigit;
            }
            num=ans;
        }
       return num; 
        
    }
};