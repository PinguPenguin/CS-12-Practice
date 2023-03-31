import java.awt.*;

public class RightConveyor { //I am so sorry for these classes, I just had to hardcode them
    private int[] barPos = {550, 597, 644, 691, 738, 785, 832, 879, 926, 973};
    public void paint(Graphics2D g2d) {
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(550, 290, 460, 60);
        g2d.setColor(Color.BLACK);
        if (Factory.rightCheck()) {
            for (int i = 0; i < 10; i++) {
                if (barPos[i] >= 1020) {
                    barPos[i] = 550; //reset to left when you hit right max limit
                }
                barPos[i]++;
                g2d.fillRect(barPos[i], 290, 10, 60);
            }
        } else {
        for (int i = 0; i < 10; i++) {
            g2d.fillRect(barPos[i], 290, 10, 60);
        }
    }
    }
}
