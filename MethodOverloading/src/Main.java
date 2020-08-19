public class Main {
    public static void main(String[] args) {
        double conv1 = calcFeetAndInchesToCentimeters(5,11);
        System.out.println(conv1);

    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet >= 0 ||(inches>=0 && inches<=12 )){
            double feetToInches = feet * 12;
            double newInches = feetToInches + inches;
            double centimeters = newInches * 2.54;
            return centimeters;
        }else
            return -1;

    }
    public static double calcFeetAndInchesTOCentimeters(double inches){
        if(inches >= 0){
            double feet = (int) (inches / 12);
            double newInches = inches % 12;
            double centimeters = calcFeetAndInchesToCentimeters(feet,newInches);
            return centimeters;

        }else
            return -1;
    }
}
