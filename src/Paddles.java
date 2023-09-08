import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddles extends Rectangle{

    int id;
    int yVelocity;

    Paddles(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    public void setYDirection(int yDirection) {

    }

    public void move() {

    }

    public void draw(Graphics g) {
        if(id == 1) {
            g.setColor(Color.blue);
        } else {
            g.setColor(Color.RED);
        }
        g.fillRect(x, y, width, height);
    }
}
