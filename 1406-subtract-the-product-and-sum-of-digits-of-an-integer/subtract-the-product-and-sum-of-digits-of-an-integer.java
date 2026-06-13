class Solution {
    public int subtractProductAndSum(int n) {
        int multiply = 1;
        int sum = 0;
        while (n > 0) {
            int num = n % 10;
            int number = n / 10;
            multiply = multiply * num;
            sum = sum + num;
            n = number;
        }
        int result = multiply - sum;
        return result;
    }
}