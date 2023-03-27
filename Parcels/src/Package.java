import java.awt.*;

public class Package {
    private int length;
    private int height;
    private int width;
    private int location;
    //1 = international, 2 = domestic, 3 = unknown
    private int number;

    private boolean scanned = false;
    public void scan (){
        scanned = true;
    }

    public Package(int length, int width, int height, int location, int number){
        this.length = length;
        this.height = height;
        this.width = width;
        this.location = location;
        this.number = number;
    }

    public void paint(Graphics2D g2d) {
        if (location == 1) {
            g2d.setColor(Color.BLUE);
        } else if (location == 2) {
            g2d.setColor(Color.GREEN);
        } else {
            g2d.setColor(Color.YELLOW);
        }

        g2d.fillRect(number * 50, 320, width, height);
    }
}
