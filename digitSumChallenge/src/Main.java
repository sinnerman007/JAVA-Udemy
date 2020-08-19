public class Main {
    public static void main(String[] args) {
        System.out.println("sum of digits = " + sumDigits(123456789));

    }
    public static int sumDigits(int number){
        if(number < 10) {
            return -1;
        }
        int sum = 0;

        while (number>0){
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }
}
