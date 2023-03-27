import java.awt.*;
import javax.swing.*;

public class Building {
    private int x;
    private int y;
    public Building (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void paint (Graphics2D g2d){
        g2d.setColor(Color.gray);
        g2d.fillRect(x, y, 20, 50);
        for (int i = 0; i < 0)
    }
}
