import java.awt.*;

public class Package {
    private int length;
    private int height;
    private int width;
    private int location;
    //1 = international, 2 = domestic, 3 = unknown
    private int number;
    private int x;
    private int y;

    public Package(int length, int width, int height, int location, int number){
        this.length = length;
        this.height = height;
        this.width = width;
        this.location = location;
        this.number = number;
        x = number * 200 - 3800;
        y = 320 - height/2;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getLocation() {
        return location;
    }

    public void paint(Graphics2D g2d) {
        if (location == 1) {
            g2d.setColor(Color.BLUE);
        } else if (location == 2) {
            g2d.setColor(Color.GREEN);
        } else {
            g2d.setColor(Color.YELLOW);
        }

        if (x >= 510 - width / 2 && location == 1) {
            y--;
        } else if (x >= 510 - width / 2 && location == 3) {
            y++;
        } else if (x >= 510 - width / 2 && location == 2) {
            x++;
        } else if (!Factory.stopStatus()){
            x++;
        }
        g2d.fillRect(x, y, width, height);
    }
}
