// import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {

        // Solution 1 (cant support big numbers)

        // int value1 = Integer.parseInt(num1);
        // int value2 = Integer.parseInt(num2);

        // int sum = value1 * value2;

        // String result = String.valueOf(sum);

        // return result;


        // Solution 2 (not allowed)

        // BigInteger value1 = new BigInteger(num1);
        // BigInteger value2 = new BigInteger(num2);

        // BigInteger product = value1.multiply(value2);

        // return product.toString();


        // Solution 3

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for (int i = 0; i < m; i++) {

            int x = m - 1 - i;

            for (int j = 0; j < n; j++) {

                int y = n - 1 - j;

                int digit1 = num1.charAt(x) - '0';
                int digit2 = num2.charAt(y) - '0';

                int product = digit1 * digit2;

                int digitIndex = x + y + 1;
                int carryIndex = x + y;

                int sum = product + result[digitIndex];

                result[digitIndex] = sum % 10;
                result[carryIndex] += sum / 10;
            }
        }

        StringBuilder answer = new StringBuilder();

        for (int num : result) {
            if (!(answer.length() == 0 && num == 0)) {
                answer.append(num);
            }
        }

        return answer.toString();

        
    }
}

/*
        Every iteration follows exactly the same five steps:

        -Pick two digits.
        -Multiply them.
        -Add the existing value at result[digitIndex].
        -Store the last digit (% 10) at digitIndex.
        -Add the carry (/ 10) to carryIndex.
        */