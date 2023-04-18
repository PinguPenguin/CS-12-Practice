import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Factory extends JPanel {

     //airport scanner, not input
    private static final Package[] list = new Package[20];
    protected Scanner sc;
    private Conveyor stopCo;
    private RightConveyor rightCo;
    private UpConveyor upCo;
    private DownConveyor downCo;
    private static boolean isStopped = false;

    public static boolean rightCheck(){
        for (int i = 0; i < 20; i++) {
            if (list[i].getX() > 550 && list[i].getX() < 1020) {
                return true;
            }
        }
        return false;
    }
    public static boolean upCheck(){
        for (int i = 0; i < 20; i++) {
            if (list[i].getY() > 0 && list[i].getY() < 280) {
                return true;
            }
        }
        return false;
    }
    public static boolean downCheck(){
        for (int i = 0; i < 20; i++) {
            if (list[i].getY() > 360 && list[i].getY() < 640) {
                return true;
            }
        }
        return false;
    }

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
        stopCo = new Conveyor();
        rightCo = new RightConveyor();
        upCo = new UpConveyor();
        downCo = new DownConveyor();
        sc = new Scanner(list);
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        stopCo.paint(g2d);
        rightCo.paint(g2d);
        upCo.paint(g2d);
        downCo.paint(g2d);

        for (int i = 0; i < 20; i++) {
            list[i].paint(g2d);
        }
        sc.paint(g2d);
    }



    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("KMEM: Superhub");
        Factory fact = new Factory();
        //frame.setUndecorated(true); //hides title bar
        frame.add(fact);
        frame.setSize(1020, 640);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(true){
            Thread.sleep(10);
            frame.repaint();
        }
    }

}
