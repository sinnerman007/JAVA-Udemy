package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int myWeight = conversion(52,"kg");
        System.out.println("my weight is " + myWeight);

        int omkarWeight = conversion(150,"lbs");
        System.out.println("omkar's weight is " + omkarWeight);
        
    }
    public static int conversion(int weight,String kgLbs){
    int weight1;
    if(kgLbs == "kg"){
        weight1 =(int) (weight * 2.2);
        return weight1;
    } else if(kgLbs == "lbs"){
        weight1 = (int)(weight / 2.2);
        return weight1;
    }
    return -1;

    }
}
