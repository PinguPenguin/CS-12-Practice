import java.awt.*;
import javax.swing.*;

//panel-canvas
public class Cityscape extends JPanel{
    //background???
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Color sky = new Color(0, 45, 75);
        g2d.setColor(sky);
        g2d.fillRect(0, 0, 500, 500);
        Building b1 = new Building(5, 400);
        b1.paint(g2d);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame(" among us");

        Cityscape scape = new Cityscape();
        frame.add(scape);
        frame.setSize(500, 500);
        Building b1 = new Building(0, 300);
        frame.setVisible(true);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
