package playground.codewars;

import java.util.Random;

public class SnakesAndLadders {

    public static void main(String[] args) {

        new SnakesAndLadders();
    }

    public SnakesAndLadders() {

        Game game = new Game();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            game.play(random.nextInt(6) + 1, random.nextInt(6) + 1);
        }

    }

    class Game {
        int player1Pos = 0;
        int player2Pos = 0;
        boolean player1Active = true;
        String out = "";

        public String play(int die1, int die2) {
            System.out.println("(" + die1 + "," + die2 + ")");
            if (player1Active) {
                player1Pos = addToPlayerPos(player1Pos, die1, die2);
                out = "Player 1 is on square " + exportPositionInfo();
                System.out.println(out);
                if (die1 != die2) {
                    player1Active = false;
                }
            } else {
                player2Pos = addToPlayerPos(player2Pos, die1, die2);
                out = "Player 2 is on square " + exportPositionInfo();
                System.out.println(out);
                if (die1 != die2) {
                    player1Active = true;
                }
            }
            return "";
        }

        private int addToPlayerPos(int playerPos, int die1, int die2) {
            int tempPos = playerPos + die1 + die2;
            if (tempPos > 100) {
                return 100 - (tempPos - 100);
            }
            return tempPos;
        }

        public String exportPositionInfo() {
            String p = "";
            if (player1Active) {
                player1Pos = getNewPosition(player1Pos);
                p += player1Pos;
            } else {
                player2Pos = getNewPosition(player2Pos);
                p += player2Pos;
            }
            return p;
        }

        private int getNewPosition(int pos) {
            switch (pos) {
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


}
