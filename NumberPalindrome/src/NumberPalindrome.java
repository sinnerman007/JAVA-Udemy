public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        if(number<0){
            number = (number*number)/2;
        }
        int num = number;
        while(number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        return reverse == num;
    }
}

