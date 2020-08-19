public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int number=1;number<=1000;number++){
            if(number%3==0 && number%5==0){
                sum=sum+number;
                count++;
                if(count==5)
                    break;

            }
        }
        System.out.println("Sum of first 5 numbers divided by both 3 & 5 is "+ sum);
    }

}
