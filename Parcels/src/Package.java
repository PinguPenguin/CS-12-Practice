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

        //3D drawing section yaaayy!!!
        int[] xCoords = new int[8];
        int[] yCoords = new int[8]; //oops, I started at 1 and I'm too lazy to increment everything back 1, so 8-length array it is
        //SEE "specification.png" in ROOT FOLDER!!!!
        int L = (int) (length / Math.sqrt(2)); //okay this is super weird but every time I try to make this into just "length" (self-modifying), this becomes zero
        //System.out.println(L);
        xCoords[1] = x;
        xCoords[2] = x;
        xCoords[3] = x + width;
        xCoords[4] = x + width;
        xCoords[5] = x + L;
        xCoords[6] = x + L + width;
        xCoords[7] = x + L + width;

        yCoords[1] = y;
        yCoords[2] = y + height;
        yCoords[3] = y + height;
        yCoords[4] = y;
        yCoords[5] = y - L;
        yCoords[6] = y - L;
        yCoords[7] = y - L + height;

        //i just realized how polygons work but am NOT redoing all my arrays
        //int[] topXCoords = {xCoords[1], xCoords[2], xCoords[3], xCoords[4]};
        //int[] topYCoords = {yCoords[1], yCoords[2], yCoords[3], yCoords[4]};

        int[] topXCoords = {x, x + width, x + width + L, x + L};
        int[] topYCoords = {y, y, y - L, y - L};

        int[] sideXCoords = {x+width, x + width + L, x + width + L, x + width};
        int[] sideYCoords = {y, y - L, y - L + height, y + height};

        //g2d.drawPolygon(topXCoords, topYCoords, 4);
        g2d.fillPolygon(topXCoords, topYCoords, 4);
        g2d.fillPolygon(sideXCoords, sideYCoords, 4);

        g2d.setColor(Color.BLACK);
        g2d.drawLine(x, y, x + width, y); //1-4
        g2d.drawLine(x, y, xCoords[5], yCoords[5]); //1-5
        g2d.drawLine(x, y, x, y + height); //1-2
        g2d.drawLine(xCoords[2], yCoords[2], xCoords[3], yCoords[3]); //2-3
        g2d.drawLine(xCoords[3], yCoords[3], xCoords[4], yCoords[4]); //3-4
        g2d.drawLine(xCoords[4], yCoords[4], xCoords[6], yCoords[6]); //4-6
        g2d.drawLine(xCoords[5], yCoords[5], xCoords[6], yCoords[6]); //5-6
        g2d.drawLine(xCoords[6], yCoords[6], xCoords[7], yCoords[7]); //6-7
        g2d.drawLine(xCoords[3], yCoords[3], xCoords[7], yCoords[7]); //3-7

    }
}
