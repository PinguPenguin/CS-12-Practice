import java.awt.*;

public class Conveyor { //STOPPING CONVEYOR
    int[] barPos = {0, 50, 100, 150, 200, 250, 300, 350, 400, 450};

    public void paint(Graphics2D g2d) {
        g2d.setColor(Color.darkGray);
        g2d.fillRect(0, 290, 500, 60);
        g2d.setColor(Color.BLACK);
        if (!Factory.stopStatus()){
            for (int i = 0; i < 10; i++) {
                if (barPos[i] >= 500) {
                    barPos[i] = 0; //reset to left when you hit right max limit
                }
                barPos[i]++;
                g2d.fillRect(barPos[i], 290, 10, 60);
            }
        } else {
            for (int i = 0; i < 10; i++) {
                g2d.fillRect(barPos[i], 290, 10, 60);
            }
        }
        //make circles with spinning triangles underneath
        g2d.setColor(Color.BLACK);
        g2d.fillRect(350, 190, 60, 60);
        if (Factory.stopStatus()){
            g2d.setColor(Color.RED);
        } else {
            g2d.setColor(Color.GREEN);
        }

        g2d.fillOval(360, 200, 40, 40);
    }
}
