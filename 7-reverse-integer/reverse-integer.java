class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);
        int reversedNum=0;
        while(num!=0){
            int lastDigit = num%10;
            if(reversedNum > (Integer.MAX_VALUE - lastDigit)/10){
                return 0;
            }
            reversedNum = (reversedNum * 10) + lastDigit;
            num/=10;
        }
        return (x<0) ? (-reversedNum) : reversedNum;
    }
}