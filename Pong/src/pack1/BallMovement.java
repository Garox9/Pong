package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class BallMovement {
    Timer move;
    public BallMovement () {
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                Var.ballx += Var.balldirex;
                Var.bally += Var.balldirey;
            }
        }, 0, 6);
    }
}
