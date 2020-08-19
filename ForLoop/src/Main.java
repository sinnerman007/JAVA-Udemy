public class Main {
    public static void main(String[] args) {
//        for(double i=2; i<=8; i++ ){
//            System.out.println("The amount of 10,000 with an interest of "+ i + " is " + calculateInterest(10000,i) );
//
        for(int j=8; j>1;j--){
            System.out.println("The amount of 10,000 with an interest of "+ j + " is " + calculateInterest(10000,j));
        }
        int count = 0;

        for(int k =1; k <100;k++){

            if(isPrime(k)){
                count++;
                System.out.println("Number " + k + " is prime number");
                
                if(count==30){
                    System.out.println("Exiting Loop");
                    break;
                }
            }

        }


    }

    public static double calculateInterest(double amount, double interstRate){
        return (amount*(interstRate/100));
    }
    public static boolean isPrime(int n){

        if(n==1){
            return false;
        }

        for (int i=2;i<= n/2; i++) {
            if(n% i == 0){
                return false;
            }
        }
        return true;
    }
}
