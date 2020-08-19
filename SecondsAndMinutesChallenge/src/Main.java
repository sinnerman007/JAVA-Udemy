public class Main {
    public static void main(String[] args) {
        getDurationString(200,52);
        getDurationString(12052);
    }
    public static String getDurationString(int min,int seconds){
        if((min>0) && ((seconds>0)&&(seconds<60))){
            int hours = min/60;
            int newMin = min%60;
            System.out.println(hours + "h " + newMin + "m " + seconds + "s");
            return (hours + "h " + newMin + "m " + seconds + "s");
        }
        else
            return "invalid Value";
    }
    public static String getDurationString(int seconds){
        if(seconds<=0){
            return "Invalid Value";
        }
        int newMin = seconds/60;
        int newSec = seconds%60;
        return getDurationString(newMin,newSec);
    }
}
