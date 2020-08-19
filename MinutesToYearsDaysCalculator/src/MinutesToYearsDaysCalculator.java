public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            long hours = minutes / 60;
            long days = hours / 24;
            long YY = days / 365;
            long ZZ = days % 365;
            System.out.println(minutes + " min = "+ YY + " y and "+ ZZ + " d");
        }

    }
}
