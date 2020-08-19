

public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));

    }


    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int count = 0 ;
        int num = number;
        int lastDigit = number % 10;
        while(number>0){
            number = number /10;
            count++;
        }
        while (count>1){
            num = num / 10;
            count--;
        }
        return num + lastDigit;
    }


}
