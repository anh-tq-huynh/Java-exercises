public class Module05Challenge02 {

    public static void main(String[] args) {
        //Define the players and the scores
        String player1 = "Tim";
        int player1Score = 1500;

        String player2 = "Mark";
        int player2Score = 1000;

        String player3 = "Tony";
        int player3Score = 500;

        String player4 = "David";
        int player4Score = 100;

        String player5 = "Beck";
        int player5Score = 25;

        displayHighScorePosition(player1, calculateHighScorePosition(player1Score));
        displayHighScorePosition(player2, calculateHighScorePosition(player2Score));
        displayHighScorePosition(player3, calculateHighScorePosition(player3Score));
        displayHighScorePosition(player4, calculateHighScorePosition(player4Score));
        displayHighScorePosition(player5, calculateHighScorePosition(player5Score));

        }
    public static void displayHighScorePosition (String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }
    public static int calculateHighScorePosition (int playerScore) {
        int position;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}
