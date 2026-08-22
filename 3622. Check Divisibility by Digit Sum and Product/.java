class Solution {
    public boolean checkDivisibility(int n) {
        int digit;
        int sum = 0;
        int pro = 1;
        int org = n;
        while (org > 0) {
            digit = org % 10;
            sum = sum + digit;
            org = org / 10;
        }

        org = n;
        while (org > 0) {
            digit = org % 10;
            pro = digit * pro;
            org = org / 10;
        }
       int total = sum+pro;

         if (n % total == 0) {
            return true;
        } else
            return false;

    }
}
