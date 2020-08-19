package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;


		byte myByteNum = 10;
		short myShortNum = 20;
		int myIntNum = 50;
		long myLongNum;
		myLongNum = (long)(50000 + (10 * (myByteNum + myShortNum + myIntNum)));

		System.out.println(myLongNum);
    }
}
