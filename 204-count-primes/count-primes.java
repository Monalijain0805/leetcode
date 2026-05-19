// class Solution {
//     public int countPrimes(int n) {

//         int count = 0; // stores number of prime numbers

//         // check every number from 2 to n-1
//         for (int i = 2; i < n; i++) {

//             boolean isPrime = true; // assume number is prime

//             // check if i is divisible by any number
//             for (int j = 2; j * j <= i; j++) {

//                 // if divisible, not prime
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }

//             // if prime, increase count
//             if (isPrime) {
//                 count++;
//             }
//         }

//         return count; // return total prime count
//     }
// }




class Solution {
    public int countPrimes(int n) {

        // make array to mark prime numbers
        boolean[] notPrime = new boolean[n];

        int count = 0;

        // start from 2
        for (int i = 2; i < n; i++) {

            // if number is not marked, it is prime
            if (!notPrime[i]) {
                count++;

                // mark multiples of i as not prime
                for (int j = i + i; j < n; j += i) {
                    notPrime[j] = true;
                }
            }
        }

        return count;
    }
}