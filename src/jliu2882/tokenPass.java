package jliu2882;

public class tokenPass {
    public int[] board;
    public int currentPlayer;

    public tokenPass(int playerCount){
        int[] tempArr;
        tempArr = new int[playerCount];
        for(int i = 0; i < tempArr.length; i++){
            tempArr[i] = (int)(Math.random()*10)+1;
        }
        this.board = tempArr;
        this.currentPlayer = (int)(Math.random()*playerCount);
    }

    public void distributeCurrentPlayerToken(){
        int tokenCount = this.board[currentPlayer];
        this.board[currentPlayer] = 0;
        for(int i =1; i <= tokenCount;i++){
            this.board[(currentPlayer+i)%(this.board.length)]++;
        }
    }

    public String toString(){
        String result ="";
        for(int i = 1; i<=this.board.length; i++) {
            result+= "Player " + i + " : " + this.board[i-1] + " tokens. ";
        }
        result+= "\n Current Player: " + this.currentPlayer;
        return result;
    }

    public void nextPlayer(){
        currentPlayer++;
        if(currentPlayer>=this.board.length){
            currentPlayer=0;
        }
    }

    public int gameOver(){
        for(int i=0; i < this.board.length;i++){
            if(this.board[i]==0){
                return i;
            }
        }
        return -1;
    }
}
