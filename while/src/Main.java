public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 10;
        int count = 0;

        while (number<= finishNumber){
            number++;
            if(count == 5) {
                break;
            }
            else if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            count++;
        }
        System.out.println("Total " + count + " even numbers found");

    }

    public static boolean isEvenNumber(int number) {
        if(number%2 ==0){
            return true;
        }
        else
            return false;
    }
}
