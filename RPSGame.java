import java.util.Scanner;

public class RPSGame  implements Game
{
    //Determine the constructor
    
    Scanner scan = new Scanner(System.in);
    
    public void RPSGame() {
    }
    
    /**
     * 1 is p1 win
     * -1 is p2 win
     * 0 is a tie
     */
    public int win(Player p1, Player p2) {
        return 0;
    }
    
    public boolean end() {
        return false;
    }
    
    public void updateScore(Player p) {
        
    }
    
    public int howManyPlayers() {
        System.out.println("How many players do you have?");
        return 0;
    }
    
}
