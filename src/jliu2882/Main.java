package jliu2882;

public class Main {

    public static void main(String[] args) {
        tokenPass game1 = new tokenPass(5);
        int gameLength = 0;

        while(game1.gameOver()<0 && gameLength < 10){
            System.out.println(game1.toString());
            game1.distributeCurrentPlayerToken();
            game1.nextPlayer();
            gameLength++;
        }

        System.out.println(game1.toString());
        if(game1.gameOver()>=0) {
            System.out.println("Game Winner: Player " + game1.gameOver());
        }
        else{
            System.out.println("It was a tie");
        }
    }
}

