package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double firstValue = 20.00;
        double secondValue = 80.00;
        double myValueTotal;
        myValueTotal = (firstValue + secondValue) * 100.00;
        System.out.println("my value total = " + myValueTotal);

        double theRemainder = myValueTotal % 40.00;
        System.out.printf("remainder = "+ theRemainder );
        boolean isRemainder = (theRemainder == 0) ? true : false;

        if (!isRemainder) {
            System.out.println("Got some remainder");


        }
    }
}
