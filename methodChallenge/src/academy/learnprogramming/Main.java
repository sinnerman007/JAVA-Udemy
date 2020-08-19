package academy.learnprogramming;

public class Main {

    public static void displayHighScorePositions(String pName, int pPosition){
        System.out.println(pName + " managed to get into postion " + pPosition + " on the high score table.");


    }

    public static int calculateHighScorePosit ion(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }
        else if(playerScore >= 500){
            return 2;
        }
        else if (playerScore >= 100){
            return 3;
        }
        else
            return 4;
    }
    public static void main(String[] args) {

        displayHighScorePositions("omkar",(calculateHighScorePosition(1500)));
        displayHighScorePositions("omkar1",(calculateHighScorePosition(900)));
        displayHighScorePositions("omkar2",(calculateHighScorePosition(400)));
        displayHighScorePositions("omkar3",(calculateHighScorePosition(50)));
        displayHighScorePositions("omkar4",(calculateHighScorePosition(1000)));
    }
}
