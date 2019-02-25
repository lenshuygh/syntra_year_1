package playground.codewars;

import java.util.Random;

public class SnakesLadders {
    int player1Pos = 0;
    int player2Pos = 0;
    boolean player1Active = true;
    String out = "";

    public SnakesLadders() {

    }
    public String play(int die1, int die2) {
        if((player1Pos == 100) || (player2Pos == 100)){
            return "Game over!";
        }

        System.out.println("(" + die1 + "," + die2 + ")");
        if (player1Active) {
            player1Pos = addToPlayerPos(player1Pos,die1, die2);
            player1Pos = exportPositionInfo(player1Pos);
            if (player1Pos == 100){
                out = "Player 1 Wins!";
            }else {
                out = "Player 1 is on square " + player1Pos;
            }
            if (die1 != die2) {
                player1Active = false;
            }
        } else {
            player2Pos = addToPlayerPos(player2Pos,die1, die2);
            player2Pos = exportPositionInfo(player2Pos);
            if (player2Pos == 100){
                out = "Player 2 Wins!";
            }else {
                out = "Player 2 is on square " + player2Pos;
            }
            if (die1 != die2) {
                player1Active = true;
            }
        }
        return out;
    }

    private int exportPositionInfo(int playerPos) {
        return getNewPosition(playerPos);
    }

    private int addToPlayerPos(int playerPos,int die1, int die2) {
        int tempPos = playerPos + die1 + die2;
        if (tempPos > 100){
            return 100 - (tempPos - 100);
        }
        return tempPos;
    }

    private int getNewPosition(int pos) {
        switch (pos) {
            case 2:
                pos = 38;
                break;
            case 7:
                pos = 14;
                break;
            case 8:
                pos = 31;
                break;
            case 16:
                pos = 6;
                break;
            case 15:
                pos = 26;
                break;
            case 21:
                pos = 42;
                break;
            case 28:
                pos = 84;
                break;
            case 36:
                pos = 44;
                break;
            case 46:
                pos = 25;
                break;
            case 49:
                pos = 11;
                break;
            case 51:
                pos = 67;
                break;
            case 62:
                pos = 19;
                break;
            case 64:
                pos = 60;
                break;
            case 71:
                pos = 91;
                break;
            case 74:
                pos = 53;
                break;
            case 78:
                pos = 98;
                break;
            case 87:
                pos = 94;
                break;
            case 89:
                pos = 68;
                break;
            case 92:
                pos = 88;
                break;
            case 95:
                pos = 75;
                break;
            case 99:
                pos = 80;
                break;
        }
        return pos;
    }
}