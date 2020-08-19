public class EqualSumChecker {
    public static boolean hasEqualSum(int num1,int num2,int num3){
        int sumof12 = num1 + num2;
        if(num3 == sumof12){
            return true;
        }
        else
            return false;
    }
}
