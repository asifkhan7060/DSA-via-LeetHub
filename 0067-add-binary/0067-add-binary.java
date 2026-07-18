class Solution {
    public String addBinary(String a, String b) {

        /*
        Solution 1 (can't support big numbers)

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        int pass1 = calculateDecimal(x);
        int pass2 = calculateDecimal(y);

        int sum = pass1 + pass2;

        StringBuilder result = new StringBuilder();

        while (sum > 0) {
            result.append(sum % 2);
            sum = sum / 2;
        }

        return result.reverse().toString();

        public int calculateDecimal(int a) {

            int result = 0;

            for (int i = 0; a > 0; i++) {
                int value = a % 10;
                a = a / 10;
                result = result + (value * (int) Math.pow(2, i));
            }

            return result;
        }
        */


        // Solution 2 (Accepted)

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int pass1 = 0;
            int pass2 = 0;

            if (i >= 0) {
                pass1 = a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                pass2 = b.charAt(j) - '0';
                j--;
            }

            int sum = pass1 + pass2 + carry;

            result.append(sum % 2);

            carry = sum / 2;
        }

        return result.reverse().toString();
    }

}