import java.util.*;
import java.lang.*;

class Player {
    int id;
    String name;
    int score;
    
    Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.score = 0;
    }
    public void updateScore(int currentDice) {
        score += currentDice;
        System.out.format("\n%s \tscore = %d\n", name, score);
    }
    
    @Override
    public String toString() {
        return name + " [" + score + "]";
    }
}

class Dice {
    public int roll() {
        return 1 + (int)(Math.random() * 6);
    }
}

class Game {
    Player player1;
    Player player2;
    Dice dice;
    Game() {
        player1 = new Player(1, "James");
        player2 = new Player(2, "Ching");
        dice = new Dice();
    }
    private Player winner() {
        if(player1.score > player2.score) {
            return player1;
        } else if(player2.score > player1.score) {
            return player2;
        } else {
            return null;
        }
    }
    public void play() {
        Player currentPlayer = player1;
        int currentDice;
        int playCounter = 10;
        
        while(playCounter-- > 0) {
            currentDice = dice.roll();
            currentPlayer.updateScore(currentDice);
            if(currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }
        if(winner() != null) {
            System.out.println(winner() + " WINS !");
        } else {
            System.out.println("Game tie !");
        }
    }
}

class Rextester {  
    public static void main(String args[])
    {
        Game game = new Game();
        game.play();
    }
}
public static void public static public static void main(String[] args) {
	
}