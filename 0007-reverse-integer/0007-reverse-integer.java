class Solution {
    public int reverse(long x) {
        long rev=0;
        while (x != 0) {
            long digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
        return 0;
        }
    else
    return (int)rev;
        }
    }
