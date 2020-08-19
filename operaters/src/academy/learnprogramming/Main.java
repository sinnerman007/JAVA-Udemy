package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an Alien");
            System.out.println("And I am scared of aliens");
        }

        int topscore = 100;
        if (topscore !=1 && topscore >= 35 ){
            System.out.println("you are not perfect but you passed the test");
        }
        System.out.println(" ");

        int newValue = 50;
        if(newValue == 50 ){
            System.out.println("this is not an error");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("this is not suppose to happen");
        }

        boolean wasCar = isCar ? true  : false;
        

    }
}
