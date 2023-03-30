import java.awt.*;

public class Scanner {

    private int currentLocation = 0;
    Package[] list;
    public Scanner(Package[] list) {
        this.list = list;
        for (int i = 0; i < 20; i++) {
            System.out.println(list[i]);
        }
    }

    public boolean isIntersecting(){ //checks each package for adjacency to scanner
        for (int i = 0; i < 20; i++) {
            if (list[i].getX() > 470 && list[i].getX() < 550 && list[i].getY() < 340 && list[i].getY() > 280) {
                currentLocation = list[i].getLocation();
                return true;
            }
        }
        System.out.println("nah");
        return false; //none error code
    }

    public void paint(Graphics2D g2d){
        g2d.setColor(Color.GRAY);
        g2d.fillRect(470, 280, 80, 80);
        //TEST LINES
        //g2d.setColor(Color.RED);
        //1020x640
        //g2d.drawLine(0, 320, 1020, 320);
        //g2d.drawLine(510, 0, 510, 640);
        if (isIntersecting()) {
            g2d.setColor(Color.YELLOW);
            g2d.fillOval(480, 290, 20, 20);
        }
        if (currentLocation == 1) {

        }
    }

}
