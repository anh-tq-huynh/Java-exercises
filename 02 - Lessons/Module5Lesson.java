public class Module5Lesson {
    public static void main(String[] args) {

        //if condition
        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if (highScore < 25) {
            highScore = 1000 + highScore;       //add bonus point
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore -1000;
        }

        //Methods
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highestScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("High score is " + highestScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("High score is " + calculateScore(gameOver, score, levelCompleted, bonus));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return  finalScore;
    }
}
