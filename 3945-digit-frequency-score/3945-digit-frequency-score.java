// class Solution {
//     public int digitFrequencyScore(int n) {

//         int sum = 0;
//         int x = 0;
//         // 123

//         while(n != 0){

//             x = n % 10;
//             sum = sum + x;
//             n = n/10;
//         }

//         return sum;
        
//     }
// }

class Solution {
    public int digitFrequencyScore(int n) {

        int[] freq = new int[10];

        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        int score = 0;

        for (int i = 0; i < 10; i++) {
            score += i * freq[i];
        }

        return score;
    }
}