import java.awt.*;

public class Scanner {
    private boolean isScanning = false;
    private long timeTick = 0;

    public void scan(){
        isScanning = true;
    }

    public void paint(Graphics2D g2d){
        g2d.setColor(Color.GRAY);
        g2d.fillRect(470, 280, 80, 80);
        //TEST LINES
        g2d.setColor(Color.RED);
        //1020x640
        g2d.drawLine(0, 320, 1020, 320);
        g2d.drawLine(510, 0, 510, 640);
    }

}
