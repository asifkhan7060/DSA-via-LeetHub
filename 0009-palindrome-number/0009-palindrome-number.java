class Solution {
    public boolean isPalindrome(int x) {

        int original = x;
        int reminder = 0;
        int reverse =0;

        if(x<0){
            return false;
        }

        while(x!=0){
            reminder = x % 10;
            reverse = reverse*10+reminder;
            x=x/10;            
        }

        
        return original == reverse;
    }
}