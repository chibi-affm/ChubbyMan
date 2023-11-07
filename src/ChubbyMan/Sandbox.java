package ChubbyMan;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Sandbox {


    public static void main(String[] args) {

        // PacMan Picture Stand-by
        Picture pacMan = new Picture(60, 110, "resources/Stand1Right.png");

        GridFactory start = new GridFactory();

        // Create Timer and Score instances
        Rectangle startGrid = start.createGrid(0, 0, 1280, 720);
        Score score = new Score();
        CountDownTimer countdownTimer3 = new CountDownTimer(20000, score);
        EventHandler startScreen = new EventHandler(startGrid, pacMan, start, countdownTimer3);

        // Initialize Start Screen
        startScreen.initStart();
        start.createGridStartScreen(startGrid, 50);

        // Draw Main Grid
        GridFactory grid = new GridFactory();
        Rectangle mainGrid = grid.createGrid(0, 0, 1280, 720);
        grid.drawGrid(mainGrid);

        // Draw Player PacMan and initialize its movement
        EventHandler movePacMAn = new EventHandler(mainGrid, pacMan, grid, countdownTimer3);

        pacMan.draw();
        movePacMAn.init();

        // Initialize Timer
        countdownTimer3.initTimer();

        // Run end game
        EndGame endGame = new EndGame(score, countdownTimer3);
        endGame.endOfGame();

    }
}
