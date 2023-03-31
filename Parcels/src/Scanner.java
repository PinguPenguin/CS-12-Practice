import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Scanner {
    private BufferedImage destination = null;
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
            g2d.setColor(Color.RED);
            g2d.fillOval(480, 290, 20, 20);
        }
        if (currentLocation == 1) {
            try {
                destination = ImageIO.read(new File("res\\Jayjay.PNG"));
                //100x20
            } catch (IOException e) {
                System.out.println(":(");
            }
            g2d.drawImage(destination, 10, 520, null);
        }
        if (currentLocation == 2) {
            try {
                destination = ImageIO.read(new File("res\\TRUCKIN.PNG"));
                //100x20
            } catch (IOException e) {
                System.out.println(":(");
            }
            g2d.drawImage(destination, 10, 470, null);
        }
        if (currentLocation == 3) {
            try {
                destination = ImageIO.read(new File("res\\what.png"));
                //100x20
            } catch (IOException e) {
                System.out.println(":(");
            }
            g2d.drawImage(destination, 10, 510, null);
        }
    }

}
