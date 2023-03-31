import java.awt.*;

public class DownConveyor { //I am so sorry for these classes, I just had to hardcode them
    int[] barPos = {360, 407, 454, 501, 548, 595};
    public void paint(Graphics2D g2d) {
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(480, 360, 60, 280);
        g2d.setColor(Color.BLACK);
        if (Factory.downCheck()) {
            for (int i = 0; i < 6; i++) {
                if (barPos[i] >= 640) {
                    barPos[i] = 360; //reset to top when you hit right max limit
                }
                barPos[i]++;
                g2d.fillRect(480, barPos[i], 60, 10);
            }
        } else {
            for (int i = 0; i < 6; i++) {
                g2d.fillRect(480, barPos[i], 60, 10);
            }
        }
    }
}
