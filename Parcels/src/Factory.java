import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Factory extends JPanel {

    protected Scanner sc = new Scanner(); //airport scanner, not input
    public final Package[] list = new Package[20];
    public static long globalTick = 0;
    public Conveyor stopCo;
    private static boolean isStopped = false;

    public static boolean stopStatus(){
        return isStopped;
    }
    public Factory(){
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE){
                    isStopped = !isStopped;
                }
            }
        });
        setFocusable(true);

        //dimensions of packages
        for (int i = 0; i < 20; i++){
            int length = (int) (Math.random() * 20 + 10);
            int width = (int) (Math.random() * 20 + 10);
            int height = (int) (Math.random() * 20 + 10);
            int location = (int) (Math.random() * 3 + 1);
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
        stopCo.paint(g2d);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("KMEM: Superhub");
        Factory fact = new Factory();
        //frame.setUndecorated(true); //hides title bar
        frame.add(fact);
        frame.setSize(1020, 640);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(true){
            Thread.sleep(10);
            frame.repaint();
            globalTick++;
        }
    }

}
