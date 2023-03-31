import java.awt.*;

public class UpConveyor { //I am so sorry for these classes, I just had to hardcode them
    int[] barPos = {280, 233, 186, 139, 92, 45};
    public void paint(Graphics2D g2d) {
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(480, 0, 60, 280);
        g2d.setColor(Color.BLACK);
        if (Factory.upCheck()) {
            for (int i = 0; i < 6; i++) {
                if (barPos[i] <= 0) {
                    barPos[i] = 280; //reset to top when you hit right max limit
                }
                barPos[i]--;
                g2d.fillRect(480, barPos[i], 60, 10);
            }
        } else {
            for (int i = 0; i < 6; i++) {
                g2d.fillRect(480, barPos[i], 60, 10);
            }
        }
    }
}
