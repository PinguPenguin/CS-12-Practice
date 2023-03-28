import java.awt.*;

public class Conveyor {
    public boolean stoppable;
    public String dir;
    //"up", "down", "right"
    public Conveyor(boolean stoppable, String dir){
        this.stoppable = stoppable;
        this.dir = dir;
    }

    public void paint(Graphics2D g2d) {
        //make circles with spinning triangles underneath
        if (Factory.stopStatus()){
            g2d.setColor(Color.RED);
        } else {
            g2d.setColor(Color.GREEN);
        }
        g2d.fillOval(40, 40, 40, 40);
    }
}
