import javax.swing.*;
import java.awt.*;

public class Factory extends JPanel {

    protected Scanner sc = new Scanner(); //airport scanner, not input
    public final Package[] list = new Package[20];
    public static long globalTick = 0;
    public Conveyor stopCo;

    public Factory(){
        //dimensions of packages
        for (int i = 0; i < 20; i++){
            int length = (int) (Math.random() * 20 + 10);
            int width = (int) (Math.random() * 20 + 10);
            int height = (int) (Math.random() * 20 + 10);
            int location = (int) (Math.random() * 3);
            list[i] = new Package(length, width, height, location, i);
        }
        stopCo = new Conveyor(true, "right");
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        sc.paint(g2d);
        for (int i = 0; i < 20; i++) {
            list[i].paint(g2d);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("KMEM: Superhub");
        Factory fact = new Factory();
        frame.setUndecorated(true);
        frame.add(fact);
        frame.setSize(1020, 640);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(true){
            frame.repaint();
            globalTick++;
        }
    }

}
