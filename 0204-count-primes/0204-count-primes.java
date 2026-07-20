class Solution {
    public int countPrimes(int n) {

        // Not correct - but tried 
        /*
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=2; j<n; j++){

                if(i==0 || i==1){
                    break;
                }

                if(i%j != 0){
                    count++;
                    break;
                }
            }
        }
        return count; */


        // Correct Soln by gpt - but time exceeds - O(n√n)
        /*
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (i == 0 || i == 1) {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        return count;
        */

        // standard Sieve of Eratosthenes solution - Time: O(n log log n) ✅
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];

        // Assume every number is prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Mark non-prime numbers
        for (int i = 2; i * i < n; i++) {

            if (isPrime[i]) {

                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count remaining prime numbers
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}